import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unstop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\anjani\\AppData\\Local\\Google\\Chrome\\User Data\\chrome_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://unstop.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='fixed_icon align-center']//div[@class='login_btn waves-effect ng-star-inserted'][normalize-space()='Login']")).click();	
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(3);
        System.out.println(driver.findElement(By.cssSelector(".error.ng-star-inserted")).getText());
        System.out.println(driver.findElement(By.xpath("//div[normalize-space()='Please enter Password']")).getText());
        driver.findElement(By.id("sign-up")).click();
        driver.findElement(By.id("first_name")).sendKeys("Rahul");
        driver.findElement(By.id("last_name")).sendKeys("Mandothia");
        driver.findElement(By.id("your_username")).sendKeys("Rahul_Lalaji");
       
        WebElement dropdownButton = driver.findElement(By.xpath("//div[@id=\"mat-select-value-1\"]"));
        dropdownButton.click();
        WebElement optionToSelect = driver.findElement(By.xpath("//div[@id=\"mat-select-0-panel\"][1]"));
        optionToSelect.click();
        
        driver.findElement(By.id("email_address")).sendKeys("rahulmandothia9@gmail.com");  
        driver.findElement(By.cssSelector("#mat-input-0")).sendKeys("7982839551");
        driver.findElement(By.id("organisation-organisation_select_input")).sendKeys("Pacific HealthCare");
        driver.findElement(By.xpath("(//li[@id='organisation-organisation_select_list_item_1'])[1]")).click();
        Thread.sleep(5);
        driver.findElement(By.xpath("(//input[@id='choose_password'])[1]")).sendKeys("Password@123");
        driver.findElement(By.xpath("(//input[@id='confirm_password'])[1]")).sendKeys("Password@123");
        driver.findElement(By.xpath("(//label[contains(text(),'All your information is collected, stored and proc')])[1]")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='Register'])[1]")).click();
        
        List<WebElement> searchBox = driver.findElements(By.id("organisation-organisation_select_list"));
        System.out.println(searchBox.size());
        for(WebElement searchBox1: searchBox)
        {
            if(searchBox1.getText().equalsIgnoreCase("Pacific HealthCare"))
            {
            	searchBox1.click();
            	break;
            }
        }
	}
}