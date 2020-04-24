package com.knu.KNUP.File;

import java.sql.Date;

public interface IFileDao {
	public void fileUpLoad(String fileName, float fileCapacity, String fileFormat, String time);
}
