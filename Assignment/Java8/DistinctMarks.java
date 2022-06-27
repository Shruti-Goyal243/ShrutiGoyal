import java .util.*;
 
class DistinctMarks
{
    static void printDistinct(int array[], int n)
    {
        Arrays.sort(array);
        for (int i = 0; i < n; i++)
        {
            while (i < n - 1 && array[i] == array[i + 1])
                i++;
            System.out.print(array[i] +" ");
        }
    }
     
 
    public static void main (String[] args)
    {
        int array[] = {78,76,77,87,77,76,74};
        int n = array.length;
        printDistinct(array, n);
 
    }
}