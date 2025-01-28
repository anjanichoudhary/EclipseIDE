import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("http://192.168.1.155:8000/eh/login");
		options.setCapability("proxy", proxy);

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);

		FirefoxOptions options1 = new FirefoxOptions();
		options1.setAcceptInsecureCerts(true);

		EdgeOptions options2 = new EdgeOptions();
		options2.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anjani\\AppData\\Local\\Google\\Chrome\\User Data\\chrome_path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);

		System.setProperty("webdriver.firefox.driver", "C:\\browserdrivers\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver(options1);

		System.setProperty("webdriver.edge.driver", "C:\\browserdrivers\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver(options2);

		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver1.get("https://expired.badssl.com/");
		driver1.manage().window().maximize();
		System.out.println(driver1.getTitle());

		driver2.get("https://expired.badssl.com/");
		driver2.manage().window().maximize();
		System.out.println(driver2.getTitle());

	}

}
