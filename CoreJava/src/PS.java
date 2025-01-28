import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {
	public void doThis()
	{
		System.out.println("I am here");
	}

	
	@BeforeMethod
	public void befourRun()
	{
		System.out.println("Run me first");
	}
	
	@AfterMethod
	public void afterRun()
	{
		System.out.println("Run me last");
	}
}
