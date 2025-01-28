import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

	public static void main(String[] args) throws Throwable {
		
        // Set the path to the ChromeDriver executable
    	System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\anjani\\AppData\\Local\\Google\\Chrome\\User Data\\chrome_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Windows maximize
		driver.manage().window().maximize();
		
		// Get URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Global Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		// Login Credentials & click button
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button")).click();

		// click "Recruitment" menu button
		driver.findElement(By.xpath("//span[normalize-space()='Recruitment']")).click();
		
		// Click Vacancy drop-down field
		driver.findElement(By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();

		// Select "Associate IT Manager" & click
		
		
		// Click Search button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// "Associate IT Manager" records displayed
		System.out.println(driver.findElement(By.cssSelector("div[class='oxd-table-body']")).getText());

		// Log Out
		  WebElement dropdownButton =
		  driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		  dropdownButton.click();
		  
		  WebElement optionToSelect = driver.findElement(By.xpath("//li[@class='--active oxd-userdropdown']//li[4]")); optionToSelect.click();
	}

}
