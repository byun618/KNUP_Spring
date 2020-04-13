package com.knu.KNUP.Print;

import java.sql.Date;

import org.springframework.stereotype.Repository;

@Repository("printDto")
public class PrintDto {
	
	private int printNo;
	private int userId;
	private int fileNo;
	private int printerNo;
	private Date printDate;
	private int printStatus; // 0: 신청, 1: 완료
	
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
	public int getPrinterNo() {
		return printerNo;
	}
	public void setPrinterNo(int printerNo) {
		this.printerNo = printerNo;
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
}
