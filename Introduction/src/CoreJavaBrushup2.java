import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1, 2, 3, 4, 5, 6,7, 8, 9, 10, 110, 115};
		for(int i = 0; i <arr2.length;i++)
		{
			if(arr2[i] % 2 ==0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i] + " " + "is not multiple of 2" + '\n');
			}
		}
		
		ArrayList<String> strings =new ArrayList<>();
		strings.add("Kumar");
		strings.add("Gupta");
		strings.add("Sharma");
		strings.add("Singh");
		strings.add("Jha");
		strings.add("Chawhan");
		strings.add("Kumber");
		System.out.println(strings.get(4));
		
		/*
		 * for(String str : strings) { if(str.startsWith("S") && str.endsWith("a")) {
		 * System.out.println(str + "'" + "is My Shar Name"); } else {
		 * System.out.println(str); } }
		 */
		
		for(int i =0; i < strings.size(); i++)
		{
			System.out.println(strings.get(i));
		}
		System.out.println("**********************");
		for(String val :strings)
		{
			System.out.println(val);
		}
		// item is present in Arraylist	
		System.out.println(strings.contains("Kumar"));
		System.out.println(strings.contains("Non"));
		String[] name = {"Rahul", "Manoj", "Shyam", "Ram", "Shivam"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("Rahul"));
		System.out.println(nameArrayList.contains("Kumar"));
	}

}
