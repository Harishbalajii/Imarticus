import java.util.Scanner;

public class ATM_program {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int choice,balance=20000,amount;
		char ch;
		do {
			System.out.println("1.withdraw");
			System.out.println("2.deposit");
			System.out.println("3.check balance");
			System.out.println("4.Exit");
			System.out.println("Enter your choice; ");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				amount=s.nextInt();
	             balance=balance-amount;
				System.out.println("Balance = "+balance);
				break;
			case 2:
				amount=s.nextInt();
				balance=balance+amount;

				System.out.println("Balance = "+balance);

				break;

				case 3:

				System.out.println("Balance = "+balance);

				break;

				case 4:

				System.exit(0);

				break;

				default:

				System.out.println("Invalid input");

				}
			System.out.println("Do you want to continue? y or n:");
			ch=s.next().charAt(0);

				}

       while(ch=='y'||ch=='y');
		
				
			}
			
}	





