package operators;
import java.util.Scanner;
public class studentpercentagecal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks in subject 1");
		int sub1=scan.nextInt();
		System.out.println("Enter marks in subject 2");
		int sub2=scan.nextInt();
		System.out.println("Enter marks in subject 3");
		int sub3=scan.nextInt();
		System.out.println("Enter marks in subject 4");
		int sub4=scan.nextInt();
		
		System.out.println("Enter the marks in subject 5");
		int sub5=scan.nextInt();
		
		
		int  Total= sub1+sub2+sub3+sub4+sub5;
		double percentage=Total/5.0;
		
		System.out.println("the total marks of student is:"+Total);
		System.out.printf("Percentage is: %.1f%n", percentage);
		
		
		
		scan.close();
		

	}

}
