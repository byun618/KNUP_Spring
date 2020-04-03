package com.knu.KNUP.Printer;

public class PrinterDto {
	
	private int printerNo;
	private String printerLoc;
	private int printerState; //0 : 고장 or 사용불가, 1 : 정상, 사용가능
	
	public int getPrinterNo() {
		return printerNo;
	}
	public void setPrinterNo(int printerNo) {
		this.printerNo = printerNo;
	}
	public String getPrinterLoc() {
		return printerLoc;
	}
	public void setPrinterLoc(String printerLoc) {
		this.printerLoc = printerLoc;
	}
	public int getPrinterState() {
		return printerState;
	}
	public void setPrinterState(int printerState) {
		this.printerState = printerState;
	}
	
}
