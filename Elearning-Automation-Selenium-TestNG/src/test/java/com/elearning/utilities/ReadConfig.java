package com.elearning.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {

		File src = new File("./Configuration\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			System.out.println("file not found");

		}

	}

	public String getURL() {
		String URL = pro.getProperty("baseURL");
		return URL;
	}

	



	public String getChromeDriver() {
		String Chrome = pro.getProperty("chrome");
		return Chrome;
	}

	public String getFirefoxDriver() {
		String FireFox = pro.getProperty("firefox");
		return FireFox;
	}

	public String getIEDriver() {
		String IE = pro.getProperty("IE");
		return IE;
	}

}
