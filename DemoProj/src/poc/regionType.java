package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class regionType {
@Test
public void reg() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPackage\\Browser Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
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
	driver.findElement(By.xpath("//*[text()='Region Type']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[text()='Search Region Type']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@ng-model='queryFieldCtrl.value'])[2]")).sendKeys("Region");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='activeQuerySearch']")).click();
	Thread.sleep(2000);
	Actions ac=new Actions(driver);
	//WebElement dc=driver.findElement(By.xpath("(//*[@class='ui-grid-cell-contents ng-binding'])[1]"));
	
	Thread.sleep(2000);
	
	ac.moveToElement(driver.findElement(By.xpath("(//*[@class='ui-grid-cell-contents ng-binding'])[1]"))).doubleClick().build().perform();
	//driver.findElement("(//*[@class='ui-grid-cell-contents ng-binding'])[1]")
	Thread.sleep(6000);
	driver.switchTo().parentFrame();
	Thread.sleep(6000);
	driver.findElement(By.xpath("(//*[@data-ng-hide='!isAccessible'])[1]")).click();
	
	
	
	
	
	
}
}
