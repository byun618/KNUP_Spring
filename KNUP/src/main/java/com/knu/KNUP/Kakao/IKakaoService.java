package com.knu.KNUP.Kakao;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public interface IKakaoService {
	
	public void excute();
	public void excute(Model model);
	public void excute(String code, HttpSession session);
	public void excute(String token);
}
