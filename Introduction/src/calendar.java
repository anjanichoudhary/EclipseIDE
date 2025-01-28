import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anjani\\AppData\\Local\\Google\\Chrome\\User Data\\chrome_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		/*
		 * System.out.println(driver.findElements(By.tagName("form")).size());
		 * driver.switchTo().frame(0);
		 */
		driver.findElement(By.xpath(".//input[@id='form-field-travel_comp_date']")).click();
		driver.findElement(By.cssSelector("span[title='Scroll to increment']")).getText().contains("April");
		
		while(!driver.findElement(By.cssSelector("span[title='Scroll to increment']")).getText().contains("August"))
		{
			driver.findElement(By.cssSelector("span[title='Scroll to increment']")).click();
		}
		List<WebElement> dates = driver.findElements(By.xpath("flatpickr-day"));
		
		int count=driver.findElements(By.className("flatpickr-day")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("30"))
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}
	}

}
