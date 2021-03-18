import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

public class secondTest extends Demo {
@Test
public void bb() throws InterruptedException, IOException
{
	String name=Util.getPropertyName("browser");
	System.out.println(name);
	test=extent.startTest(this.getClass().getName());
	//System.setProperty("webdriver.gecko.driver", "C:\\SeleniumPackage\\Browser Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
   // driver=new FirefoxDriver();
	test.log(LogStatus.PASS, "passed");
	driver.get(" http://10.186.26.228:8080/bdd");
	test.log(LogStatus.PASS, "Browser invoked");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='user']")).sendKeys("axr61927");
	test.log(LogStatus.PASS, "Username Entered");
}
}
