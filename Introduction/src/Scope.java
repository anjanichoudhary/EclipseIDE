import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//1. Give me the count of links on the page.
		//2. Count of footer section
		
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\anjani\\AppData\\Local\\Google\\Chrome\\User Data\\chrome_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // Limiting webdriver scope
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		//3 count of footer 1 column 
		
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4- click on each link in the coloumn and check if the pages are opening-
		for(int i=0; i<columndriver.findElements(By.tagName("a")).size(); i++)
		{
			
			String clickonlineTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlineTab);
			Thread.sleep(5000);
		}
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
