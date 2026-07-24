// write a java program to find the given number is armstrong or not
/*(123) it is a 3 digit number the armstrong number is 1^3+2^3+3^3=123 is called armstrong number   */


package loop;
import java.util.Scanner;
public class Practice2loop {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the number");
		int number=scan.nextInt();
		
		//find the length of the number
		int count=0;
		int n=number;
		while(n>0) {
			n=n/10;
			count++;
		}
		
		//find the individual digit
		//length power of each digit
		//find the sum of power
		n=number;
		int sumofpower=0;
		while(n!=0) {
			int digit=n%10;
			n=n/10;
			int power =(int)Math.pow(digit,count);
			sumofpower += power;
		}
		if(sumofpower==number) {
			System.out.println("the number "+number+" is: armstrong number");
		}else {
		System.out.println("the number"+number+" is not armstrong number");
		}
		scan.close();

	}

}
