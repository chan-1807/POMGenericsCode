package dataDriven;

import java.util.ArrayList;

import excel.utility.Xls_Reader;

public class TestUtil {
	static Xls_Reader reader;
	public static ArrayList<Object[]> datamethod() {
		ArrayList<Object[]> data=new ArrayList<Object[]>();
		
		reader=new Xls_Reader("C:\\Users\\Chandru\\eclipse-workspace\\TestNG\\EXCEL\\Book1.xlsx");
		
		for(int row=2;row<= reader.getRowCount("Sheet1");row++) {
			String firstname=reader.getCellData("Sheet1", "firstname", row);
			String lastname=reader.getCellData("Sheet1", "lastname", row);
			String phone=reader.getCellData("Sheet1", "phone", row);
			String date=reader.getCellData("Sheet1", "city", row);
			String sex=reader.getCellData("Sheet1", "Sex", row);
			Object temp[]= {firstname,lastname,phone,date,sex};
			data.add(temp);
	}
	
	return data;
	
}
}