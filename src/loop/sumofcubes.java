package loop;
import java.util.Scanner;
public class sumofcubes {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n =scan.nextInt();
		
		int sumofcube=0;
		int i=1;
		while(i<=n) {
			int cubes=(int)Math.pow(i, 3);
			sumofcube+=cubes;
			++i;
		}
		
		System.out.println("the sum of cubes of"+n+" natural num =" +sumofcube);
		
		scan.close();

	}

}
