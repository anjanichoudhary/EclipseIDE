
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNub =5;
		String website = "Experiom India";
		char letter = 'r';
		double dec = 0.45;
		boolean myCard = false;
		
		System.out.println(myNub + "is store in the my Nub");
		System.out.println(website + myNub + myCard + dec + myCard + letter);
		System.out.println(myCard);
		//Arrays -
		int[] arr = new int[5] ;
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.print(arr[4]);
		
		int[] arr2 = {1, 5, 3, 9, 4, 2, 8};
		
		System.out.println(arr2[3]);
		
		//For loop arr.length
		
		for(int i=0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name = {"Rahul", "Manoj", "Shyam", "Ram", "Shivam"};
		
		for(int i =0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		for(String s: name)
		{
			System.out.println(s);
		}
	}

}
