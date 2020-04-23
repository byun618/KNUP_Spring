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
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service("kakaoSendMsgService")
public class KakaoSendMsgService implements IKakaoService {

	@Override
	public void excute(String code, HttpSession session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excute(String token) {
		// TODO Auto-generated method stub
//		JsonNode profile = getProfile(token);
//		
//		String nickName = profile.path("nickName").asText();
//		String profileImageURL = profile.path("profileImageURL").asText();
//		String thumbnailURL = profile.path("thumbnailURL").asText();
//		String countryISO = profile.path("countryISO").asText();
//
//		System.out.println(nickName);
//		System.out.println(profileImageURL);
//		System.out.println(thumbnailURL);		
//		System.out.println(countryISO);
		JsonNode sentResult = sendMsg(token);
		String result = sentResult.path("result_code").asText();
		System.out.println(result);
	}
	
	private JsonNode getProfile(String autorize_code) {
		final String requestUrl = "https://kapi.kakao.com/v1/api/talk/profile";
		final HttpClient client = HttpClientBuilder.create().build();
		final HttpPost post = new HttpPost(requestUrl);
		
		post.addHeader("Authorization", "Bearer " + autorize_code);
		
		JsonNode returnNode = null;
		
		try {
			
			final HttpResponse response = client.execute(post);
			final int responseCode = response.getStatusLine().getStatusCode();
			
//			System.out.println("\nSending 'POST' request to URL : " + requestUrl);
//			System.out.println("Response Code : " + responseCode);
			
			//JSON �삎�깭 諛섑솚媛� 泥섎━ 
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
	
	private JsonNode sendMsg(String autorize_code) {
		final String requestUrl = "https://kapi.kakao.com/v2/api/talk/memo/default/send";
		final List<NameValuePair> postParams = new ArrayList<NameValuePair>();
		
		final HttpClient client = HttpClientBuilder.create().build();
		final HttpPost post = new HttpPost(requestUrl);
		
		JsonNode returnNode = null;
		
		String jsonStr = "{\n" + 
				"    \"object_type\" : \"text\",\n" + 
				"    \"text\" : \"Hello World\",\n" + 
				"    \"link\" : {\n" + 
				"        \"web_url\" : \"localhost:8181/KNUP/\",\n" + 
				"        \"mobile_web_url\" : \"localhost:8181/KNUP/\"\n" + 
				"    },\n" + 
				"    \"button_tile\" : \"바로 확인\"\n" + 
				"}";
		
//		ObjectMapper mapper = new ObjectMapper();
//		String jsonNode = mapper.readTree(jsonStr);
		
		post.addHeader("Authorization", "Bearer " + autorize_code);
		postParams.add(new BasicNameValuePair("template_object", jsonStr));
		
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
}
