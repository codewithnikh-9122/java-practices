//write a java program to reverse a string

package loop;
import java.util.Scanner;
public class reverseString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string :");
		String data= scan.nextLine();
		int index=0;
		String reverse="";
		while(index< data.length()) {
			char ch=data.charAt(index);
			reverse =ch + reverse;
			++index;
		}
		System.out.println("string after reverse = "+reverse);
		scan.close();
	}
}
