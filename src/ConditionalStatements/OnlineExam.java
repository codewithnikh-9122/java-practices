package ConditionalStatements;
import java.util.Scanner;
public class OnlineExam {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the marks of student");
		int mark = scan.nextInt();
		System.out.println("enter the attandence %");
		int AttendancePercentage = scan.nextInt();
		  
		
		if(mark>=40 && AttendancePercentage>=75) {
			System.out.println("the student is pass ");
		}
		else {
			System.out.println("student is failed");
		}
		
		scan.close();
		

	}

}
