import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\anjani\\AppData\\Local\\Google\\Chrome\\User Data\\chrome_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		/*
		 * js.executeScript("window.scrollBy(0,500)"); Thread.sleep(3000);
		 * js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		 * 
		 * List<WebElement> values =
		 * driver.findElements(By.cssSelector(".left-align tr th:nth-child(2)"));
		 * 
		 * int sum =0;
		 * 
		 * for(int i=0;i<values.size();i++) { System.out.println(values.size()); }
		 */
		
		WebElement table=driver.findElement(By.id("product"));


		System.out.println(table.findElements(By.tagName("tr")).size());


		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());


		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));


		System.out.println(secondrow.get(0).getText());


		System.out.println(secondrow.get(1).getText());


		System.out.println(secondrow.get(2).getText());
	}

}
