package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Driver.Demo;

public class countryRefernceType extends Demo{
	@Test
	public void reference() throws InterruptedException
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPackage\\Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://10.186.28.90:8080/bdd/");*/
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("axr61927");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Bunty@132");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//*[@class='app-anchor ng-binding'])[2]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@class='new-menu infaWSLabel']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Country Reference Type']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='OK'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='countryRefTypeName']")).sendKeys("Reference1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='countryRefTypeDesc']")).sendKeys("Reference1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='dvc-icons add-record']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@aria-label='Select box activate'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@title='New addition']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Apply']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//button[@data-ng-hide='!isAccessible'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='taskAddComment']")).sendKeys("create");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-ng-click='saveWithTaskAttributes()']")).click();;
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[text()='All Tasks']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Update with Approval for Medical Condition']")).click();
		Thread.sleep(12000);
		
	}

}
