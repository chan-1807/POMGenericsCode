package com.crm.util;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.crm.base.BasePage;

public class Utilities extends BasePage{

	public Utilities(WebDriver driver) {
		super(driver);
	}
	
	public static ArrayList<Object> getDataFromExcel() {
		ArrayList<Object> mydata=new ArrayList<Object>();
		
		Xls_Reader reader=new Xls_Reader("C:\\Users\\Chandru\\Desktop\\CRM.xlsx");
		String sheetname="CRM Contacts";
		int rowCnt=reader.getRowCount(sheetname);
		
		for (int row=2;row<=rowCnt;row++) {
			String title=reader.getCellData(sheetname, "title", row);
			String firstname=reader.getCellData(sheetname, "firstname", row);
			String lastname=reader.getCellData(sheetname, "lastname", row);
			String companyname=reader.getCellData(sheetname, "company", row);
			
			Object[] data= {
					title,firstname,lastname,companyname
			};
			
			mydata.add(data);
		}
		return mydata;
	}

}
