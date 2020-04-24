package com.knu.KNUP.Print;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface IPrintService {

	public void excute();
	public void excute(MultipartHttpServletRequest mtf);
}
