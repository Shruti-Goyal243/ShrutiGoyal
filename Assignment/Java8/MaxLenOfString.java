//5. WAP to find the maximum length of given string without using any length function use stream api. 


public class MaxLenOfString{
	
	public static void main(String args[])
		{
		
		System.out.println(getLength("Hello World"));
		
		}
        
	public static int getLength(String str)
        {
          	    int i=0;
          	    try{
          	    
          	    while(true)
          	    {
          	        str.charAt(i);
          	        i++;
          	    }
          	    }
          	    catch(IndexOutOfBoundsException e)
          	    
          	    {
          	     return i;   
          	    }
         }


}