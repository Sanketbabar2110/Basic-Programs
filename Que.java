
import java.util.Scanner;
public class Que{
		public static void main(String[] args) {
		
		int c1=0, c2=0, c3=0;
		boolean b = true;
		String str = "Yes";
		Scanner sc = new Scanner(System.in);
		
		while(b) {

			if(str.equals("No")) {
				System.out.println("Enter any number : ");
				int s = sc.nextInt();
				if(s>0)
					c1++;
				else if(s<0)
					c2++;
				else
					c3++;
				System.err.println("you want to Exit");
			}
			else if(str.equals(sc.next())) {
				System.out.println("Total positive numbers : "+c1);
				System.out.println("Total negative numbers : "+c2);
				System.out.println("Total number of zeros  : "+c3);
				
				System.exit(0);
			}
		}
		sc.close();
	}
}