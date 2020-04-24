package com.knu.KNUP.Print;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller("printGenerateCodeService")
public class PrintGenerateCodeService implements IPrintService {

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		generateCode();
	}
	
	private String generateCode() {
		
		Random rd = new Random();
	
		int rdNum = rd.nextInt(1000000);	
		String rdStr = String.format("%06d", rdNum);
		 
		return rdStr;
		
	}

	@Override
	public void excute(MultipartHttpServletRequest mtf) {
		// TODO Auto-generated method stub
		
	}

	

}
