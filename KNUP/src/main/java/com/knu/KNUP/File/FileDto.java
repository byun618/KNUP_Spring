package com.knu.KNUP.File;

import java.sql.Date;

public class FileDto {
	
	private int fileNo;
	private String fileName;
	private float fileCapacity;
	private String fileFormat;
	private Date fileUploadDate;
	
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
	public void setFileCapacity(float fileCapacity) {
		this.fileCapacity = fileCapacity;
	}
	public String getFileFormat() {
		return fileFormat;
	}
	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}
	public Date getFileUploadDate() {
		return fileUploadDate;
	}
	public void setFileUploadDate(Date fileUploadDate) {
		this.fileUploadDate = fileUploadDate;
	}

}
