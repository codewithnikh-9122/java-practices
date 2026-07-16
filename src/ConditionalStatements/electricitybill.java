package ConditionalStatements;
import java.util.Scanner;

public class electricitybill {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter electricity unit");
	int unit= scan.nextInt();
	
	if(unit>100) {
		System.out.println("extra charges applied");
		
	}else {
		System.out.println("normal charge");
	}
	scan.close();
	}
}
