package com.knu.KNUP.File;

import java.sql.Date;

public interface FileDao {
	public void fileUpLoad(int fileNo , String fileName, float fileCapacity, String fileFormat, Date fileUploadDate);
}
