package com.knu.KNUP.Print;

import java.sql.Date;

import org.springframework.stereotype.Repository;

public class PrintDto {
	
	private int printNo;
	private int userId;
	private int fileNo;
	private Date printDate;
	private int printStatus; // 0: not working 1 : working
	private String code;
	private String printerName;
	
	public int getPrintNo() {
		return printNo;
	}
	public void setPrintNo(int printNo) {
		this.printNo = printNo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFileNo() {
		return fileNo;
	}
	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}
	
	public Date getPrintDate() {
		return printDate;
	}
	public void setPrintDate(Date printDate) {
		this.printDate = printDate;
	}
	public int getPrintStatus() {
		return printStatus;
	}
	public void setPrintStatus(int printStatus) {
		this.printStatus = printStatus;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPrinterNo() {
		return printerName;
	}
	public void setPrinterNo(String printerName) {
		this.printerName = printerName;
	}
}
