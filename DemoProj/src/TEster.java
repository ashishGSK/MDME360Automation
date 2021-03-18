import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TEster  extends Demo {
	
	//public WebDriver driver;
	
	

	
	
@Test
public void aa() throws InterruptedException, IOException
{
	//String name=Util.getPropertyName("browser");
	//System.out.println(name);
	//test=extent.startTest("Get Password");
	//System.setProperty("webdriver.gecko.driver", "C:\\SeleniumPackage\\Browser Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
   // driver=new FirefoxDriver();
	//test.log(LogStatus.PASS, "passed");
	//driver.get(" https://www.google.it/");
	//test.log(LogStatus.PASS, "Browser invoked");
	//Thread.sleep(5000);
	//Reuse.type("xpath");
	//driver.findElement(By.xpath("//input[@name='user']")).sendKeys("axr61927");
	//test.log(LogStatus.PASS, "Username Entered");
	Repo.userName.sendKeys("axr61927");
	
	
	
	
}

}
