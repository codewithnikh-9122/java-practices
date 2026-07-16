package ConditionalStatements;
import java.util.Scanner;
public class Shoppingdiscount {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter purchase amount");
		 int amount=scan.nextInt();
		 
		 if(amount>5000) {
			 System.out.println("customer is a premium member");
		 }else {
			 System.out.println("customer is not premium member");
		 }
scan.close();
	}

}
