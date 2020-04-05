package com.knu.KNUP.Kakao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.knu.KNUP.User.IUserDao;
import com.knu.KNUP.User.UserDto;

public class KakaoLoginService implements IKakaoService {
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void excute(String code, HttpSession session) {
		// TODO Auto-generated method stub
		//Get AccessToken
		JsonNode accessToken = getAccessToken(code).get("access_token");
		session.setAttribute("token", accessToken.toString());
		
		//Get UserInformation
		JsonNode userInfo = getUserInfo(accessToken);
		
		JsonNode properties = userInfo.path("properties");
		JsonNode kakao_account = userInfo.path("kakao_account");
		
		int userId = Integer.parseInt(userInfo.path("id").asText());
		String userEmail = kakao_account.path("email").asText();
		String userName = properties.path("nickname").asText();
		
		UserDto dto = new UserDto();
		dto.setUserId(userId);
		dto.setUserEmail(userEmail);
		dto.setUserName(userName);

		IUserDao dao = sqlSession.getMapper(IUserDao.class);
		dao.insertUser(userId, userEmail, userName);
	}

	
	private JsonNode getAccessToken(String authorize_code) {
		
		final String requestUrl = "https://kauth.kakao.com/oauth/token";
		final List<NameValuePair> postParams = new ArrayList<NameValuePair>();
		
		postParams.add(new BasicNameValuePair("grant_type", "authorization_code"));
		postParams.add(new BasicNameValuePair("client_id", "7e5d1c5a3647aead2c2abadcedbe6754"));
		postParams.add(new BasicNameValuePair("redirect_uri", "http://localhost:8181/KNUP/login"));
		postParams.add(new BasicNameValuePair("code", authorize_code));
		
		final HttpClient client = HttpClientBuilder.create().build();
		final HttpPost post = new HttpPost(requestUrl);
		
		JsonNode returnNode = null;
		
		try {
			
			post.setEntity(new UrlEncodedFormEntity(postParams));
			final HttpResponse response = client.execute(post);
			ObjectMapper mapper = new ObjectMapper();
			returnNode = mapper.readTree(response.getEntity().getContent());
			
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch(ClientProtocolException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
		}
		
		return returnNode;
	}

	private JsonNode getUserInfo(JsonNode accessToken) {
		
		final String requestUrl = "https://kapi.kakao.com/v2/user/me";
		final HttpClient client = HttpClientBuilder.create().build();
		final HttpPost post = new HttpPost(requestUrl);
		
		//add header
		post.addHeader("Authorization", "Bearer " + accessToken);
		
		JsonNode returnNode = null;
		
		try {
			
			final HttpResponse response = client.execute(post);
			final int responseCode = response.getStatusLine().getStatusCode();
			
//			System.out.println("\nSending 'POST' request to URL : " + requestUrl);
//			System.out.println("Response Code : " + responseCode);
			
			//JSON 형태 반환값 처리 
			ObjectMapper mapper = new ObjectMapper();
			returnNode = mapper.readTree(response.getEntity().getContent());
			
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch(ClientProtocolException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
		}
		
		return returnNode;
	}

	@Override
	public void excute(String token) {
		// TODO Auto-generated method stub
		
	}

	

}
