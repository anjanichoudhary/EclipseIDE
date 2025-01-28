
public class DuplicateCharacter {

	    public static void main(String[] args) {
	        String input = "Anjani";
	        String result = removeDuplicates(input);
	        System.out.println("Original String: " + input);
	        System.out.println("String with Duplicates Removed: " + result);
	    }

	    public static String removeDuplicates(String str) {
	        StringBuilder result = new StringBuilder();
	        boolean[] visited = new boolean[256]; // Assuming ASCII characters

	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            if (!visited[currentChar]) {
	                result.append(currentChar);
	                visited[currentChar] = true;
	            }
	        }
	        
	        return result.toString();
	    }
	}