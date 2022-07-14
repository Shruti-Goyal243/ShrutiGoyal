package Com.TDD_Assignment.Palindrome;

public class Palindrome {
	  public static void main(String[] args) {

	        Palindrome palindrome = new Palindrome();

	        String input = "Poor Dan is in a droop";

	        if (palindrome.isPalindrome(input))
	            System.out.println("\"" + input + "\" is a palindrome.");
	        else
	            System.out.println("\"" + input + "\" is not a palindrome.");

	    }

	    public boolean isPalindrome(String input) {

	        //Converting input to Lowercase and removing all white spaces
	        input = input.toLowerCase().replaceAll("\\s+", "");

	        //Length of input
	        int length = input.length();

	        //Check if non alpha-numeric string
	        if (!input.matches("^([a-z0-9]+)?$")) {
	            return false;
	        }

	        //Character by character comparision
	        for (int i = 0; i < length / 2; i++) {
	            if (input.charAt(i) != input.charAt(length - i - 1)) {
	                return false;
	            }
	        }
	        return true;
	    }
}
