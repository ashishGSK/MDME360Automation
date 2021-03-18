package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Driver.Demo;

public class CreateRegion  extends Demo{
	@Test
	public void create() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPackage\\Browser Drivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
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
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//*[@class='app-anchor ng-binding'])[2]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@class='new-menu infaWSLabel']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Region'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='OK'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@ng-show='$select.isEmpty()'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Bio Region']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("(//input[@name='regionName'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='regionName']")).sendKeys("forgot");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='dvc-icons add-record'])[2]")).click();
		Thread.sleep(4000);
		System.out.print(driver.findElement(By.xpath("(//*[@class='col-md-12 mdm-alert-content ng-binding'])")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@ng-click='$select.activate()'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='New addition']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Apply']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@data-ng-hide='!isAccessible'])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='taskAddComment']")).sendKeys("Created");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-ng-click='saveWithTaskAttributes()']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='All Tasks']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//*[text()='Update with Approval for Region'])[1]")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//*[text()='Open']")).click();
		driver.findElement(By.xpath("//*[text()='Claim']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='Approve']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@name='addComment']")).sendKeys("approve");;
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='btn btn-primary ng-binding']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//*[text()='All Closed Tasks'])[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='Open']")).click();
		
		
		
		
		
		
		
	}

}
