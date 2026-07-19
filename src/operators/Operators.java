 package operators;
import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("enter the value of A");
			int A=scan.nextInt();
			System.out.println("enter the value of B");
			int B = scan.nextInt();
			int Sum= A+B;
			int difference=A-B;
			int multiplication=A*B;	
			float division=A/B;
			int modulo=A%B;
			System.out.println("the sum of A+B is "+ Sum );
			System.out.println("the difference of A-B is "+ difference );
			System.out.println("the multiplication of A*B is "+ multiplication );
			System.out.println("the division of A/ B is "+ division );
			System.out.println("the modulo of A % B is "+ modulo);
			scan.close();
	}

}
