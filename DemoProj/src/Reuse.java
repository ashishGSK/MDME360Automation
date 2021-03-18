import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class Reuse extends Demo {
	
	public static void type(String name)
	{
		if(name.equals("xpath"))
		{
			
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("axr61927");
		}
	}
    public static void readExcel() throws IOException
    {
    	XSSFWorkbook x=new XSSFWorkbook("./create");
    	XSSFSheet sh=x.getSheet("abc");
    }
}
