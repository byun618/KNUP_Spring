package com.knu.KNUP.Print;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.knu.KNUP.File.IFileDao;
import com.knu.KNUP.File.FileDto;

@Service("printFileService")
public class PrintFileService implements IPrintService{

	@Autowired
	SqlSession sqlSession;
	@Autowired
	FileDto fileDto;
	
	LocalDateTime ldt;
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excute(MultipartHttpServletRequest mtf) {
		// TODO Auto-generated method stub
		ldt = LocalDateTime.now();
		
		//File Tag
		String fileTag = "attach_file";
				
		//File Name
		MultipartFile file = mtf.getFile(fileTag);
		
		//File Path
		//it's your own path
		String filePath = "/Users/sbyun/Desktop/temp/";
		String fileName = file.getOriginalFilename();
		
		IFileDao dao = sqlSession.getMapper(IFileDao.class);
		dao.fileUpLoad(fileName, file.getSize(), ".docx", ldt.toString());
	
		//file transfer
		try {
			file.transferTo(new File(filePath + fileName));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}