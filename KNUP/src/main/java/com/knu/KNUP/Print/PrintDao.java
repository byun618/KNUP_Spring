package com.knu.KNUP.Print;

import java.sql.Date;

public interface PrintDao {
	public void printInfo(int printNo, int userId, int fileNo,
			Date printDate, int printStatus, String code,String printerNo);
}
