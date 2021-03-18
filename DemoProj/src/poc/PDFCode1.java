package poc;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;


public class PDFCode1 extends PDFCode{
	
	@Test
	public void pdfCreate() throws InterruptedException, BadElementException, MalformedURLException, DocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPackage\\Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://10.186.28.90:8080/bdd/");
		Thread.sleep(4000);
		
		
		
		//.scaleToFit(826, 1110)
		//getScreenshot(driver);
	}
	private Object scaleToFit() {
		// TODO Auto-generated method stub
		return null;
	}
	public static String getScreenshot(WebDriver driver) throws BadElementException, MalformedURLException, IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
		
		File destination=new File(path);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			
			
			System.out.println(e.getMessage());
		}
		return path;
	}
	public  Image screenshotPDF(WebDriver driver) throws MalformedURLException, IOException, DocumentException
	{
		Image image=Image.getInstance(getScreenshot(driver));
		image.scaleToFit(600, 600);
		
		
		return image;
	}
}
