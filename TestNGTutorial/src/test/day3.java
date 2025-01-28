package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class day3 {
	@BeforeClass
	public void befoclas() {
		System.out.println("Befour executing any methods in the class");
	}

	@Parameters({ "URL", "APIKey/usernmae" })
	@Test
	public void WebloginCarLoan(String urlname, String key) {
		// Selenium
		System.out.println("Weblogincar");
		System.out.println(urlname);
		System.out.println(key);

	}

	@BeforeMethod
	public void beforeevery() {
		System.out.println(" I will executed befoure every test method in day 3 class");
	}

	@AfterMethod
	public void afterevery() {
		System.out.println(" I will executed after every test method in day 3 class");
	}

	@AfterClass
	public void afteclas() {
		System.out.println(" After executing all methods in the class");
	}

	@Test(groups = { "Smoke" })
	public void MobileLogincarLoan() {
		// Appium
		System.out.println("Mobilelogincar");
	}

	@BeforeSuite
	public void BfSuite() {
		System.out.print("I am no 1");
	}

	@Test(enabled = false)
	public void MobileSigninLoan() {
		// Appium
		System.out.println("Mobile Signin");
	}

	@Test(dataProvider="getData")
	public void MobilesignoutLoan(String username, String password) {
		// Appium
		System.out.println("Mobiles SignOut");
		System.out.println(username);
		System.out.println(password);
	}

	@BeforeTest
	public void MobileExexuteFirst() {
		// Appium
		System.out.println("I am the no 1 lastt");
	}

	@Test(dependsOnMethods = { "WebloginCarLoan", "MobilesignoutLoan" })
	public void LoginAPIcarLoan() {
		// Rest API automation
		System.out.println("APIlogincar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// 1st Combiantion - User Name Password - good credit history=row
		// 2nd - User Name password -no crdit history
		// 3rd - Fraudelent credit history
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		//coulomns in the row are nothing but values for that particualar combination(row)
		
		// 2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "firstsecondpassword";
		
		//3ed set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thiredpassword";
		return data;
	}

}
