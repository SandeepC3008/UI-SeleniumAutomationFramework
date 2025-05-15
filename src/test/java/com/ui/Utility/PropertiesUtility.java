package com.ui.Utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.Constants.Environment;

public class PropertiesUtility {
	//to read the data from the configuration folder

	public static String ReadProperty(Environment Env, String Website)  {
		
		
		
		//System.getProperty("user.dir") ----> this gets the path of this project in any system
		File propFile = new File(System.getProperty("user.dir")+"\\Configuration\\"+Env+ ".properties");
		
		FileReader fileReader = null;
		Properties properties = new Properties();
		
		try {
			fileReader = new FileReader(propFile);
			properties.load(fileReader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = properties.getProperty(Website.toUpperCase());
		return value;

	}

}
