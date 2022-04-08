
//Changing Positions in array (Swaping) 

import java.util.Arrays;

public class ChangingPositions {
   public static void main(String args[]) 
   {
      int originalPosition = 1;
      int newPosition = 4;
      int [] x = {23, 93, 56, 92, 39};
	  
      int temp = x[originalPosition];
      x[originalPosition] = x[newPosition];
      x[newPosition] = temp;
	  
	  System.out.println("\nAfter changing positions of elements : ");
      System.out.println(Arrays.toString(x));
   }
}
