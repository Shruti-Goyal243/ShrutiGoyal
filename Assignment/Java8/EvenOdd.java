// 8. WAP to implement predicate to check given no is even or not

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
 
public class EvenOdd 
{
  public static void main(String[] args) 
  {
                IntPredicate isEven = argument -> argument % 2 == 0;
 
    
     
    System.out.println( isEven.test(9) );  //false
    System.out.println( isEven.test(10) ); //true
     
    
     
    IntStream stream = IntStream.range(1, 10); 
     
    List<Integer> evenNumbers = stream.filter(isEven)
            .boxed()
            .collect(Collectors.toList());
     
    System.out.println(evenNumbers);
  }
}

