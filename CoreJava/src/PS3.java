
public class PS3 extends PS4{

	int a;
	
	public PS3(int a) {
		super(a);   // Parent class constructor invoked
		this.a=a;  // This 
	}

	public int increment()
	{
		a= a+1;
		return a;
	}
	
	public int decrement()
	{
		a= a-1;
		return a;
	}
}
