package Com.TDD_Assignment.CountVowel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VowelsTests {
	  @Test
	    public void testCase1() {
	      assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
	    }
	    
	}
