package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {


		// TODO Auto-generated method stub
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
	}
	@Test
	public void Demo()
	{
		System.out.println("Hello"); //Automation
		Assert.assertTrue(false);
	}
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I am the no 1 last");
	}
	@Test
	public void SecondClass()
	{
		System.out.println("Bye");
	}

}
