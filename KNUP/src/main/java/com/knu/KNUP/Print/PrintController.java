package com.knu.KNUP.Print;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class PrintController {
	
	@Autowired
	IPrintService printSubmitService;
	@Autowired
	IPrintService printPrinterService;
	@Autowired
	IPrintService printFileService;
	@Autowired
	IPrintService printGenerateCodeService;
	
	
	@RequestMapping(value="/printForm")
	public String printForm(HttpServletRequest request) {
		
		String fileName = request.getParameter("fileName");
		System.out.println("printForm : " + fileName);
		
		printGenerateCodeService.excute();
		
		
		return "printForm";
	}

	@RequestMapping(value = "/printSubmit", method = RequestMethod.POST)
	public String printSubmit(MultipartHttpServletRequest mtf) { 
		
		//File Tag
		String fileTag = "file";
		//File Path
		//본인이 파일업로드 할곳의 위치
		String filePath = "/Users/sbyun/Desktop/temp/";
		//File Name
		
		MultipartFile file = mtf.getFile(fileTag);
		String fileName = file.getOriginalFilename();
		System.out.println(fileName);
		
		try {
			file.transferTo(new File(filePath + fileName));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
//		String item = mtf.getParameter("item");				
//		System.out.println("printSubmit : " + item);
		
		return "result";
	}
}
