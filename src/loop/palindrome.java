//write a java program to know a palindrome
package loop;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		
		int i=n;
		int reverse=0;
		while(i>0) {
			int digit=i%10;
			reverse = reverse*10 + digit;
			i=i/10;
		}
		if (reverse == n) {
			System.out.println(n+ "is palindrome number");
		}else {
			System.out.println(n+ "is not palindrme number");
		}
		
		scan.close();

	}

}
