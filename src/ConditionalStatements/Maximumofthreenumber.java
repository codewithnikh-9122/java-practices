package ConditionalStatements;
import java.util.Scanner;
public class Maximumofthreenumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int firstnum=scan.nextInt();
		System.out.println("enter second number");
		int secondnum=scan.nextInt();
		System.out.println("enter third number");
		int thirdnum=scan.nextInt();
		
		int max=(firstnum>secondnum) ? ((firstnum>thirdnum)? firstnum:thirdnum)
				:((secondnum>thirdnum)? secondnum:thirdnum);
	
		System.out.println("max number is: "+max);
		scan.close();

	}

}
