package ConditionalStatements;
import java.util.Scanner;
public class movieticketbookingsystem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the status of seats availability");
		boolean seatsavailable= scan.nextBoolean();
		
		if(seatsavailable=true) {
			System.out.println("Seats are available ");
			System.out.println("enter the payment status");
			boolean paymentstatus=scan.nextBoolean();
			if(paymentstatus=true) {
				System.out.println("payment is succesfull");
				System.out.println("tickect is generated");
			}else {
				System.out.println("payment is not succesfull");
			}
		}else {
			System.out.println("seats are not available");
		}
		
		
		
		scan.close();

	}

}
