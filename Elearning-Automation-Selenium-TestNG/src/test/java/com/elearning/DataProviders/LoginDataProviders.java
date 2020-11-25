package com.elearning.DataProviders;




import com.elearning.utilities.XLUtils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class LoginDataProviders {
 

  @DataProvider(name="LoginData")
  String[][] getData() throws IOException {

		String path = System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\elearning\\testData\\Login Credentials.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);// 1 0
			}

		}
		return logindata;
	}

}
