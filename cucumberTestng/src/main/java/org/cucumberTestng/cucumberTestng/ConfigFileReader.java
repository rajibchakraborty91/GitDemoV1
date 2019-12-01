package org.cucumberTestng.cucumberTestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReader {
	
	Properties prop  = new Properties();
	public String getReportConfigPath() throws FileNotFoundException, IOException{
		
		prop.load(new FileInputStream(new File("D:\\Java Documents\\text\\cucumberTestng\\src\\main\\java\\config.properties")));
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}

}
