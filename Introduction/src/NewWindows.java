import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\anjani\\AppData\\Local\\Google\\Chrome\\User Data\\chrome_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//switch Windows
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowsId = it.next();
		String childwindowId = it.next();
		driver.switchTo().window(childwindowId);
		driver.get("https://rahulshettyacademy.com/");
		String conurseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(1).getText();
		driver.switchTo().window(parentWindowsId);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(conurseName);
		
		//Screenshot
		
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("Name.png"));
		
		//Get Height & Width
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

	}

}
