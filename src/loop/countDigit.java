//write a java program to count the number

package loop;
import java.util.Scanner;
public class countDigit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		
		int count=0;
		
		while(n!=0) {
			n=n/10;
			++count;
		}
		System.out.println("number of digits :"+count);
		
		scan.close();

	}

}
