package ConditionalStatements;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the account-balance");
		double balance=scan.nextDouble();
		System.out.println("enter the withdraw ammount");
		double withdrawalAmount=scan.nextDouble();
		
		if(balance>=withdrawalAmount) {
			double Remainingbalance=  balance-withdrawalAmount;
			
			if(Remainingbalance>=1000) {
				System.out.println("Remaining balance ="+Remainingbalance);
			}
			else {
				System.out.println("Remaining balance ="+Remainingbalance);
				System.out.println("please maintain minimum balance");
			}
		}
		else {
			System.out.println("insufficient funds!");
		}
		
		scan.close();

	}

}
