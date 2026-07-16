//write a java program to sum of n natural number
package loop;


import java.util.Scanner;
public class fundamental {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the value");
		int n = scan.nextInt();
		
		int i=1;
		int sumofnum=0;
		while(i<=n) {
			sumofnum=sumofnum+i;
			i+=1;
		}
		
		System.out.println("th sum of "+n+" natural numbers =" +sumofnum);
		scan.close();

	}

}


