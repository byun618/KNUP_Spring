package com.knu.KNUP;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		logger.info("home");
		return "home";
	}
	
	@RequestMapping(value="/print")
	public String goPrint() {
		return "printForm";
	}
	
	@RequestMapping(value="/printForm")
	public String printData(HttpServletRequest httpServletRequest,Model model) {
		/*
		 * String direction=httpServletRequest.getParameter("direction"); String
		 * pagenum=httpServletRequest.getParameter("pagenum"); String
		 * printselect=httpServletRequest.getParameter("printselect");
		 */	
		return "result";
	}
	
	@RequestMapping("/result")
	public String printResult() {
		return "result";
	}
}
