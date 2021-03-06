package com.scott.transer;

import java.io.File;

public class Config {
	public static String serverRootPath = "D://";
	
	public static String transerRootPath = "transer_server";
	
	public static String getTranserPath(String path) {
		File file = new File(serverRootPath + File.separator + transerRootPath);
		if(!file.exists()) {
			if(!file.mkdirs()) {
				return null;
			}
		}
		file = new File(file.getAbsolutePath() + File.separator + path);
		return file.getAbsolutePath();
	}
	
	public static String getTanserRootPath() {
		return getTranserPath("");
	}
}
