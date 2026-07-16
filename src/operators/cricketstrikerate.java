package operators;
import java.util.Scanner;
public class cricketstrikerate {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Vaibhav score ");
		int Score=scan.nextInt();
		
		System.out.println("Enter the ball Vaibhav faced");
		int ball=scan.nextInt();
		
		double strikerate=(Score*100)/ball;
		
		
		System.out.println("run scored by vaibhav "+Score);
		System.out.println("ball faced by vaibhav :"+ball);
	    System.out.printf("Strike Rate of Vaibhav Suryavanshi: %.2f%n", strikerate);
		
		scan.close();

	}

}
