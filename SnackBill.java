import java.util.Scanner;

public class SnackBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int choice, quantity, teaQuantity=0, greenTQuantity=0, samosaQuantity = 0, sandwitchQuantity=0;
		do {
			System.out.println("------------------------------------------------------------------------------------------------------------");
			System.out.println("PRESS 1: TEA (Rs.10)");
			System.out.println("PRESS 2: GREEN TEA (Rs.15)");
			System.out.println("PRESS 3: SAMOSA (Rs.20)");
			System.out.println("PRESS 4: SANDWITCH (Rs.50)");
			System.out.println("PRESS 5: GENERATE BILL");
			System.out.println("PRESS 0: TURN OFF BILLING MACHINE.");
			System.out.println("Your choice : ");
			choice = sc.nextInt();
			if(choice > 0 && choice < 5) {
				System.out.println("Enter Quantity: ");
				quantity = sc.nextInt();
				switch (choice) {
				case 1:
					teaQuantity = teaQuantity + quantity;
					break;
				case 2:
					greenTQuantity = greenTQuantity + quantity;
					break;
				case 3:
					samosaQuantity = samosaQuantity + quantity;
					break;
				case 4:
					sandwitchQuantity = sandwitchQuantity + quantity;
					break;
				}
				System.out.println("What else you want..");
			}
			else if(choice == 5) {
				int a1=0,a2=0,a3=0,a4=0;
				System.out.println("-----------------ABC Snack Center----------------------");
				System.out.println("\n  Your Bill: ");
				if (teaQuantity > 0) {
					a1 = 10*teaQuantity;
					System.out.println("            TEA       : "+teaQuantity+"  Rs."+a1);
					
					
				} 
				if (greenTQuantity > 0) {
					a2 = 15*greenTQuantity;
					System.out.println("            GREEN TEA : "+greenTQuantity+"  Rs."+a2);
					
				} 
				if (samosaQuantity > 0) {
					a3 = 20*samosaQuantity;
					System.out.println("            SAMOSA    : "+samosaQuantity+"  Rs."+a3);
					
				} 
				if (sandwitchQuantity > 0) {
					a4 = 50*sandwitchQuantity;
					System.out.println("            SANDWITCH : "+sandwitchQuantity+"  Rs."+a4);
					
				} 
				System.out.println("----------------------------------------------------------");
				System.out.println("	                                 TOTAL: "+(a1+a2+a3+a4));
				
				if((a1+a2+a3+a4) == 0)
					System.out.println("You have'nt ordered anything. Please order somethig.");
				else
					System.out.println("                  Thank You..!");
				teaQuantity = greenTQuantity = samosaQuantity = sandwitchQuantity = 0;
				
			}
			else if(choice == 0) {
				run = false;
				System.out.println("Switching off....");
				System.out.println("-----*-----*-----*-----*-----*-----*-----*-----*-----*");
			}
			else {
				System.out.println("Invalid input..!, please enter valid choice.");
			}
		} while (run);
		
		
		
		sc.close();
	}

}
