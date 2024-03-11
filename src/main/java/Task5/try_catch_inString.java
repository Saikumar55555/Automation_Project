package Task5;

public class try_catch_inString {
	public static void main(String[] args) {
		
		        // Two strings for comparison
		        String str1 = "Order Number";
		        String str2 = "Order number";
		        
		        try {
		            // Comparing the two strings
		            if (str1.equalsIgnoreCase(str2)) {
		                System.out.println("The strings are equal.");
		            } else {
		                System.out.println("The strings are not equal.");
		            }
		        } catch (NullPointerException e) {
		            // Handling null pointer exception if one of the strings is null
		            System.out.println("One of the strings is null.");
		        }
		       
		    }
		

		
	}


