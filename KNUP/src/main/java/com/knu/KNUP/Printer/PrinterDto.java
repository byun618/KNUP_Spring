package com.knu.KNUP.Printer;

import org.springframework.stereotype.Repository;

@Repository("printerDto")
public class PrinterDto {
	
	private int printerNo;
	private String printerName;
	private int printerState; //0 : not working 1: working
	
	public int getPrinterNo() {
		return printerNo;
	}
	public void setPrinterNo(int printerNo) {
		this.printerNo = printerNo;
	}
	public String getPrinterName() {
		return printerName;
	}
	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}
	public int getPrinterState() {
		return printerState;
	}
	public void setPrinterState(int printerState) {
		this.printerState = printerState;
	}
	
}
