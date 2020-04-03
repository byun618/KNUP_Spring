package com.knu.KNUP.Kakao;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.knu.KNUP.IService;

@Controller
public class KakaoController {
	
	IService service;
	
	@RequestMapping(value = "/login", produces = "application/json", method = { RequestMethod.GET, RequestMethod.POST })
	public String login(@RequestParam("code") String code, Model model, HttpSession session) {
		
		service = new KakaoLoginService(code, session); 		
		service.excute(model);
			
		return "logininfo";
	}
	
	@RequestMapping(value = "/logout", produces = "application/json")
	public String logout(HttpSession session) {
	
		service = new KakaoLogoutService(session.getAttribute("token").toString());
		service.excute();
			
		return "redirect:/";
	}
	
	@RequestMapping(value = "/unlink", produces = "application/JSON")
	public String unlink(HttpSession session) {
		service = new KakaoUnlinkService(session.getAttribute("token").toString());
		service.excute();
		
		return "redirect:/";
	}
}
