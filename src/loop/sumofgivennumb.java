//write a java program to find sum of all digits of the given number
package loop;
import java.util.Scanner;
public class sumofgivennumb {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scan.nextInt();
		int n=number;
		int sumofdigits=0;
		
		while(n>0) {
			int digit =n%10;
			n=n/10;
			sumofdigits+=digit;
			
		}
		System.out.println("the sum of "+number+" is = "+sumofdigits);
		scan.close();

	}

}
