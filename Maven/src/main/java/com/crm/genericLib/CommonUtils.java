package com.crm.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class CommonUtils {

	public Properties getPropertiesObject() throws Throwable
	{
		String proppath="/home/tyss/Desktop/sravya/automation/Maven/src/test/resources/common.properties";
		FileInputStream fis=new FileInputStream(proppath);
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj;
		
	}
}
