package com.knu.KNUP.Print;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service("printPrinterService")
public class PrintPrinterService implements IPrintService {

	@Override
	public void excute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void excute(MultipartHttpServletRequest mtf) {
		// TODO Auto-generated method stub
		String printerName = mtf.getParameter("printerName");
		
		System.out.println(printerName);
	}


}
