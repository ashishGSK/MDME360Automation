package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class viewTarget {
	@Test
	public void target() throws InterruptedException
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Target']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Search Target']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@name='queryFieldCtrl.name'])[1]")).sendKeys("122");
		Thread.sleep(2000);
		driver.findElement(By.id("activeQuerySearch")).click();
		Thread.sleep(10000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//*[@class='ui-grid-cell-contents ng-binding'])[3]"))).doubleClick().build().perform();
		
	}

}
