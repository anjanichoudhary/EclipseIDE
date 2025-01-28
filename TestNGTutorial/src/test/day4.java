package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class day4 {
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String urlname)
	{
		//Selenium
		System.out.println("Webloginhome");
		System.out.println(urlname);
		
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("Mobileloginhome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("APIloginhome");
	}

}
