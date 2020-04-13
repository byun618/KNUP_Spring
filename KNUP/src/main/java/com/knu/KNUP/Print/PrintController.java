package com.knu.KNUP.Print;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrintController {
	
	@Autowired
	IPrintService printSubmitService;
	@Autowired
	IPrintService printPrinterService;
	@Autowired
	IPrintService printFileService;
	
	
	@RequestMapping(value="/printForm")
	public String printForm(HttpServletRequest request) {
		
		String fileName = request.getParameter("fileName");
		System.out.println("printForm : " + fileName);
		
		return "printForm";
	}
	
//	@RequestMapping(value="/printForm")
//	public String printForm(HttpServletRequest request, Model model) {
//		/*
//		 * String direction=httpServletRequest.getParameter("direction"); String
//		 * pagenum=httpServletRequest.getParameter("pagenum"); String
//		 * printselect=httpServletRequest.getParameter("printselect");
//		 */		
//		String profile = request.getParameter("profile");
//		System.out.println("printForm");
//
//		return "result";
//	}
	
	@RequestMapping("/printSubmit")
	public String printSubmit(HttpServletRequest request) {

		String item = request.getParameter("pageRange");		
//		String slideNum = request.getParameter("slideNum");
//		String printNum = request.getParameter("printNum");
//		String fileName = request.getParameter("fileName");
//		String fileName = request.getParameter("fileName");
		
		System.out.println("printSubmit : " + item);
		
		return "result";
	}
}
