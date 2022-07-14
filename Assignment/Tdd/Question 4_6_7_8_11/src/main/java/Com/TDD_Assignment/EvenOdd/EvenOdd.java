package Com.TDD_Assignment.EvenOdd;

import java.util.ArrayList;

public class EvenOdd {
	public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for(int number : numbers) {
            if(number % 2 == 0)
            {
                oddNumbers.add(number);
            } else {
                evenNumbers.add(number);
            }
        }
        return oddNumbers;
    }  
}
