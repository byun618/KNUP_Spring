package com.knu.KNUP.Kakao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpSession;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.knu.KNUP.User.IUserDao;
import com.knu.KNUP.User.UserDto;

@Service("kakaoUnlinkService")
public class KakaoUnlinkService implements IKakaoService {
	
	String a;
	int userId;
	
	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	UserDto userDto;
	
	@Override
	public void excute(String token) {
		// TODO Auto-generated method stub
		System.out.println("asd");
		JsonNode node = unlink(token);
		System.out.println("로그인 후 반환되는 아이디 : " + node.get("id"));
		
		
		a = node.get("id").toString();
		userId = Integer.parseInt(a);
		
		IUserDao dao = sqlSession.getMapper(IUserDao.class);
		dao.deleteUser(userId);
		
		
	}	
	
	private JsonNode unlink(String autorize_code) {
		JsonNode returnNode = null;
		
		final String requestUrl = "https://kapi.kakao.com/v1/user/unlink";
		final HttpClient client = HttpClientBuilder.create().build();
		final HttpPost post = new HttpPost(requestUrl); 
		
		post.addHeader("Authorization", "Bearer " + autorize_code);
		
		try {
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

	@Override
	public void excute(String code, HttpSession session) {
		// TODO Auto-generated method stub
		
	}



}
