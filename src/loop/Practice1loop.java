//write a java program to find the sum of individual digit 
//of the given number

package loop;
import java.util.Scanner;
public class Practice1loop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
		System.out.println("enter the number");
		int number=scan.nextInt();
		 
		int n=number;
		int sumofdigit=0;
		
		while(n>0) {
			int digit=n%10;
			n=n/10;
			sumofdigit+=digit;
			
		}
		System.out.println("the sum of the individual digit of "+number+" is:" +sumofdigit);
		
		scan.close();
	}

}
