package Driver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Demo {
	public static WebDriver driver;
	
	public static ExtentReports extent;
	 public static  ExtentTest test;
     public  Date d=new Date();
      public DateFormat df=new SimpleDateFormat("dd-MM-YYYY");
      public String date=df.format(d);
	//public static void main(String[] args) throws InterruptedException 
      
    @BeforeClass
    public void zz()
      {
    	extent=new ExtentReports("./Report/"+date+"extentReport.html",true);
    	 extent.addSystemInfo("Tester", "axr61927");
         extent.addSystemInfo("Report Name", "E360 Automation Report");
      }
	@BeforeMethod
	public void runn() throws InterruptedException, IOException
	{
		//extent=new ExtentReports("./Report/"+date+"extentReport.html",true);
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumPackage\\Browser Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
       driver=new FirefoxDriver();
       //extent.addSystemInfo("Tester", "axr61927");
       //extent.addSystemInfo("Report Name", "E360 Automation Report");
       
        driver.get(" http://10.186.26.228:8080/bdd");
       
	}
	

	@AfterMethod
	public void after()
	{
		
		//driver.quit();
		
	}
	@AfterClass
	public void afterClas()
	{
		extent.endTest(test);
		extent.flush();
	}
	
}
