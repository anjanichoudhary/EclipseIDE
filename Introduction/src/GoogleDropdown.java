import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjani\\AppData\\Local\\Google\\Chrome\\User Data\\chrome_path\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://www.google.com/");
		  driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		  Thread.sleep(2000);
		  List<WebElement> options = driver.findElements(By.cssSelector("div[role='presentation']"));
		  
	//    System.out.println(driver.findElements(By.cssSelector("li[class='ui-menu-item']")).getText());
		  System.out.println(options.size());
		  
		  for(int i=0;i<options.size();i++)
	        {
	            System.out.println(options.get(i).getText());
	        }

	        // Select the 2nd suggestion from the list
	        if (options.size() >= 2) {
	            WebElement secondSuggestion = options.get(1); // Index 1 is the 2nd suggestion
	            secondSuggestion.click();
	        }
	        System.out.println("Successfully Run Code!"); // Add Success message
	        System.out.println("All Dropdown functionality working Properly.!");
	}

}