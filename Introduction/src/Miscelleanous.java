import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrom.driver",
				"C:\\Users\\anjani\\AppData\\Local\\Google\\Chrome\\User Data\\chrome_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("id('email')")).sendKeys("anjani.87199@gmail.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		int a=5;
		getScreenshot(driver);
		
	}
	public static void getScreenshot(WebDriver driver) throws IOException
	{

		driver.get("https://google.com");

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("E:\\DevOps\\All Screen Shots\\All Services Under 135 Linux Server\\Anjani.jfif"));

	}

}
