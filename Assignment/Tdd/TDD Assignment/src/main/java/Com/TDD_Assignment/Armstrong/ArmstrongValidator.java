package Com.TDD_Assignment.Armstrong;
import static java.lang.String.valueOf;
public class ArmstrongValidator {
	 public boolean isValid(int candidate) {
	        char[] digits = valueOf(candidate).toCharArray();
	        int result = 0;
	        for (char digit : digits) {
	            int d = Character.digit(digit, 10);
	            result += Math.pow(d, digits.length);
	        }
	        return result == candidate;
	    }
	}

