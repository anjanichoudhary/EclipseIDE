import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiscelleanousManage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anjani\\AppData\\Local\\Google\\Chrome\\User Data\\chrome_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().deleteCookieNamed("sessionKey");
		driver.manage().logs();

		driver.get("http://google.com");
	}

}
