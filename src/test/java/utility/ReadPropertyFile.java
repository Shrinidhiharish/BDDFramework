package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	static Properties prop;
	public static void property_File() throws IOException
	{
	prop = new Properties();
	FileInputStream ip = new FileInputStream(".\\src\\test\\java\\resources\\configurableProperty.Properties");
	prop.load(ip);
	
	}

}
