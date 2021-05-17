package com.crm.util;

import com.crm.base.CRMBaseClass;

public class crmCommonUtilities extends CRMBaseClass {

	public static void switchto(String frame) {
		driver.switchTo().frame(frame);
	}
	public static void switchto(int num) {
		driver.switchTo().frame(num);
	}
	
}
