package com.knu.KNUP.Kakao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpSession;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.ui.Model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class KakaoLogoutService implements IKakaoService {

	@Override
	public void excute(String token) {
		// TODO Auto-generated method stub
		JsonNode node = logout(token);
		System.out.println("로그인 후 반환되는 아이디 : " + node.get("id"));
	}

	

	private JsonNode logout(String autorize_code) {
		
		final String requestUrl = "https://kapi.kakao.com/v1/user/logout";
		final HttpClient client = HttpClientBuilder.create().build();
		final HttpPost post = new HttpPost(requestUrl);
		
		post.addHeader("Authorization", "Bearer " + autorize_code);
		
		JsonNode returnNode = null;
		
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
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub

	}

	
	
}
