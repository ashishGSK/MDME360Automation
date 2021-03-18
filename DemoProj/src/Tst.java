
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tst {
@Test
public void a() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumPackage\\Browser Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://10.186.28.90:8080/bdd/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("axr61927");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Bunty@132");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//*[@class='app-anchor ng-binding'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='LEGACY_SEARCH']")).click();
	Thread.sleep(6000);
	driver.switchTo().frame(0);
	Thread.sleep(6000);
	driver.findElement(By.xpath("//span[text()='Country']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[text()='Search Country']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='queryFieldCtrl.name'])[1]")).sendKeys("abc");
	
	
}
}
