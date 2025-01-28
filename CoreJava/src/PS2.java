import org.testng.annotations.Test;

public class PS2  extends PS {

	@Test
	public void testRun()
	
	{
		PS3 ps3 = new PS3(3); // Parameterized Constructor
		int a =3;
		doThis();  // Parent class
		System.out.println(ps3.increment());
		System.out.println(ps3.decrement());
		//PS4 ps4 = new PS4(3); // Parameterized Constructor
		System.out.println(ps3.multiplication());
	}
}