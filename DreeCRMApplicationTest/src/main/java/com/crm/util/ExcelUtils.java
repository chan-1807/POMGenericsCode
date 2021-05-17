package com.crm.util;

import java.util.ArrayList;

import com.crm.base.CRMBaseClass;

public class ExcelUtils extends CRMBaseClass {
	static Xls_Reader reader;
	
	public static ArrayList<Object> testData() {
		reader=new Xls_Reader("C:\\Users\\Chandru\\eclipse-workspace\\DreeCRMApplicationTest\\ExcelDatas\\CRM.xlsx");
		
		int rowcnt=reader.getRowCount("CRM Contacts");
		
		
		ArrayList<Object> mydata= new ArrayList<Object>();
		
		for(int i=2;i<=rowcnt;i++) {
			String firstname=reader.getCellData("CRM Contacts", "firstname", i);
			String lastname=reader.getCellData("CRM Contacts", "lastname", i);
			String company=reader.getCellData("CRM Contacts", "company", i);
			
			Object[] data= {firstname,lastname,company
		};
		
			mydata.add(data);
		
		
	}
		return mydata;
}
}
