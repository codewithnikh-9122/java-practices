package ConditionalStatements;
import java.util.Scanner;
public class restaurant {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the true or false to represent the ordr acceptance:");
		boolean isaccepted=scan.nextBoolean();
		
		if(isaccepted) {
			
			System.out.print("enter true or false to represent the avilability of delivary partner:");
			boolean isavilable=scan.nextBoolean();
			
			 if (isavilable) {
				 System.out.println("enter the payment status");
				boolean ispaid=scan.nextBoolean();
			 }else {
				 System.out.println("your order is not confirmed");
			 }
		}else {
			System.out.println("delivary partner is not avilable at the moment");
			System.out.println("order is canceled");
		}
	}
	}

