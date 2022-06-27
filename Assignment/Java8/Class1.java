// 12. WAP to find maximum of 5 no , pass array to lambda expression , and return the maximum
//using lambda expression. Don't use nested if else.import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Class1
{

public static Integer getMax(List<Integer> list)
{
return list.stream()
.collect(Collectors.maxBy(Comparator.naturalOrder()))
.get();
} public static void main (String[] args)
{
List<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 6, 5, 45,9, 1));
System.out.println("Maximum element is " + getMax(list));
}
}
