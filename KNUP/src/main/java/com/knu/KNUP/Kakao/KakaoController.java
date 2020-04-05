package com.knu.KNUP.Kakao;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class KakaoController {
	
	@Autowired
	IKakaoService kakaoLoginService;
	@Autowired
	IKakaoService kakaoLogoutService;
	@Autowired
	IKakaoService kakaoUnlinkService;
	
	
	@RequestMapping(value = "/login", produces = "application/json", method = { RequestMethod.GET, RequestMethod.POST })
	public String login(@RequestParam("code") String code, Model model, HttpSession session) {
		
		kakaoLoginService.excute(code, session);
			
		return "logininfo";
	}
	
	@RequestMapping(value = "/logout", produces = "application/json")
	public String logout(HttpSession session) {
	
		kakaoLogoutService.excute(session.getAttribute("token").toString());
			
		return "redirect:/";
	}
	
	@RequestMapping(value = "/unlink", produces = "application/JSON")
	public String unlink(HttpSession session) {

		kakaoUnlinkService.excute(session.getAttribute("token").toString());
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
}
