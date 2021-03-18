import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Util {
	
	public static FileInputStream fis;
	public static Properties prop;
	
	public static String getPropertyName(String propName) throws IOException
	{
		
			fis=new FileInputStream("./config.properties");
			prop=new Properties();
			prop.load(fis);
			
			
			
		return prop.getProperty(propName);
		
	}

}
