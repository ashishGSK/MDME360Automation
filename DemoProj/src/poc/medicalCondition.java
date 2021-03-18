package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class medicalCondition {
	@Test
	public void createMedicalCondition() throws InterruptedException
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
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//*[@class='app-anchor ng-binding'])[2]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@class='new-menu infaWSLabel']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Medical Condition'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='OK'])[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='medicalConditionName']")).sendKeys("medicaqw8");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='longName']")).sendKeys("medical229");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='shortName']")).sendKeys("medical321");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='dvc-icons add-record'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@ng-click='$select.activate()'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='New addition']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Apply']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//*[@data-ng-hide='!isAccessible'])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='taskAddComment']")).sendKeys("created");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-ng-click='saveWithTaskAttributes()']")).click();
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[text()='All Tasks']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//*[text()='Update with Approval for Medical Condition'])[1]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[text()='Claim']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[text()='Release']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='taskAddComment']")).sendKeys("rel");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='Release'])[2]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//*[text()='Available Tasks'])[1]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[text()='Claim']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//*[text()='All Assigned Tasks'])[1]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//*[text()='Approve'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='taskAddComment']")).sendKeys("approve");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='Approve'])[1]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//*[text()='All Closed Tasks'])[1]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//*[text()='Open'])[1]")).click();
		
		
		
		
	}

}
