package ConditionalStatements;
import java.util.Scanner;
public class NESTED {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    System.out.print("Enter the year:");
		    int year = scan.nextInt();

	  
		if (year % 4 ==0) {
			if (year %100  != 0) {
				System.out.println(year+ "is leap year");
				
			}else {
				if(year%400 == 0) {
					System.out.println(year+ "is leap year");
					
				}
			else {
			System.out.println(year+"year is not leap year");
			}
		}
		}  
		else {
			System.out .println(year+"year is not leap year");
		}
		
		scan.close();
	}

}
