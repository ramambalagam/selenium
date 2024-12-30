package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertyFile {

	public static  Properties propertyval() throws IOException
	{

		Properties propertiesobj = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\config.properties");
		propertiesobj.load(file);//load file
		file.close();
		return propertiesobj;



	}
}
