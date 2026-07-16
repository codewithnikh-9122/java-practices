package ConditionalStatements;
import java.util.Scanner;
public class bonus {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the salary of the employee");
		 double salary=scan.nextDouble();
		 System.out.println("Enter the experience of the employee");
		 double experience=scan.nextDouble();
		 System.out.println("Enter the employe performance rating");
		 double rating=scan.nextDouble();
		 
		 int bonus;
		 
		 if(salary > 50000 && experience >= 5 && rating >= 4) {
			 System.out.println("employee is eligible for bonus");
		 }else {
			 System.out.println("there is no bonus");
		 }
		 
		 
		 
		scan.close();

	}

}
