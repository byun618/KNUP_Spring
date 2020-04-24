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

import com.knu.KNUP.File.FileDto;

@Controller
public class PrintController {
	
	@Autowired
	IPrintService printSubmitService;
	@Autowired
	IPrintService printGenerateCodeService;
	@Autowired
	IPrintService printPrinterService;
	@Autowired
	IPrintService printFileService;
	
	@RequestMapping(value="/printForm")
	public String printForm(HttpServletRequest request) {
		
		//printGenerateCodeService.excute();
		
		return "printForm";
	}

	@RequestMapping(value = "/printSubmit", method = RequestMethod.POST)
	public String printSubmit(MultipartHttpServletRequest mtf) { 
		
		String direction = mtf.getParameter("direction");
		String slideQty = mtf.getParameter("slideQty");
		String pageRange = mtf.getParameter("pageRange");
		String printQty = mtf.getParameter("printQty");
	
		printFileService.excute(mtf);
		printPrinterService.excute(mtf);
		
		//i think need table about print config
		
		

		
		return "result";
	}
}
