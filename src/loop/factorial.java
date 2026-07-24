package loop;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the number");
		int  number=scan.nextInt();
		
		long fact=1;
		if(number<0) {
			System.out.println("factorial is not allowed for negative number");
		}
		else if(number==0 || number==1) {
			System.out.println("factorail of "+number+" is: " +fact);
		}
		else {
			for(int i=number;i>=1;i--) {
				fact=fact * i;
			}
		System.out.println("the factorial of "+number+" is : " +fact );
		}
		
		scan.close();

	}

}
