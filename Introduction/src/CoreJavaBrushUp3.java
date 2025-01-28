
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string is object //String literal
		/* String s1 = "Anjani Choudhary Acadmey"; */
		String s6 = "Hello";
		
		//new
		String s4 = new String("Welcome");
		String s5 = new String("Welcome");
		
		String s3 = "Anjani Choudhary Acadmey";
		String[] splittedString = s3.split("Choudhary");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		/* System.out.println(splittedString[2]); */
		System.out.println(splittedString[1].trim());
		for(int i=s3.length()-1;i>=0; i--)
		{
			System.out.println(s3.charAt(i));
		}
	}

}
