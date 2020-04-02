package com.knu.KNUP.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private Kako_restapi kaka_restapi = new Kako_restapi();
	
	@RequestMapping(value = "/login")
	public String login() {
		return "test";
	}
	
	@RequestMapping(value = "/oauth", produces = "application/json", method = { RequestMethod.GET, RequestMethod.POST })
	public String kakaoLogin(@RequestParam("code") String code) {
		System.out.println(code);
		return "home";
	}
}
