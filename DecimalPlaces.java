
 //How to maintain decimal places of double value
 
 import java.math.*;
 public class DecimalPlaces{
 public static void main(String[]args)
 {
	 double d = 10.123456789;
	 
	 //maintian deimal places upto 4 digits
	 System.out.print("Number with four decimal places : "+String.format("%.4f",d));
 }
 }