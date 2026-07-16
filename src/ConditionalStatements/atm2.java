package ConditionalStatements;
import java.util.Scanner;
public class atm2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String confirmpin="1023";
		System.out.println("please insert card:");
		System.out.println("Enter the status of card:");
		
		boolean iscardvalid=scan.nextBoolean();
		if(iscardvalid== true) {
			System.out.println("enter the pin:");
			String atmpin=scan.next();
			if(confirmpin.equals(atmpin)) {
				System.out.println("enter the account balance");
				int balance=scan.nextInt();
				if(balance>=1000) {
					System.out.println("trensactions are allowed");
				}else {
					System.out.println("transactions are not allowed");
				}
			}else {
				System.out.println("you are not allowed for banking operations");
			}
		}
		else {
			System.out.println("card is invalid");
			System.out.println("transaction is not possible");
		}
		scan.close();
	}

}
