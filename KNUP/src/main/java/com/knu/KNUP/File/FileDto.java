package com.knu.KNUP.File;

import java.sql.Date;

import org.springframework.stereotype.Repository;

@Repository("fileDto")
public class FileDto {
	
	private int fileNo;
	private String fileName;
	private long fileCapacity;
	private String fileFormat;
	
	
	public int getFileNo() {
		return fileNo;
	}
	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public float getFileCapacity() {
		return fileCapacity;
	}
	public void setFileCapacity(long fileCapacity) {
		this.fileCapacity = fileCapacity;
	}
	public String getFileFormat() {
		return fileFormat;
	}
	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}
	

}
