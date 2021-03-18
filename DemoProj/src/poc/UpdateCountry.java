package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UpdateCountry {
	
	@Test
	public void create() throws InterruptedException
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
		driver.findElement(By.xpath("//span[text()='Country']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Search Country']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//input[@name='queryFieldCtrl.name'])[1]")).sendKeys("abc");
		driver.findElement(By.xpath("(//input[@name='queryFieldCtrl.name'])[1]")).sendKeys("Ireland");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='queryFieldCtrl.name'])[3]")).sendKeys("Ireland");
		Thread.sleep(2000);
		driver.findElement(By.id("activeQuerySearch")).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		Thread.sleep(10000);
		WebElement e=driver.findElement(By.xpath("(//*[@class='ui-grid-cell-contents ng-binding'])[2]"));
		act.moveToElement(e).doubleClick().build().perform();
	}

}
