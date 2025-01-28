import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test111 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\anjani\\AppData\\Local\\Google\\Chrome\\User Data\\chrome_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Recruitment']")).click();
		driver.findElement(By.xpath(
				"//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-candidate-page']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]/div[1]"))
				.click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Associate IT Manager']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".oxd-table-row.oxd-table-row--with-border")).getText());
	}
}
