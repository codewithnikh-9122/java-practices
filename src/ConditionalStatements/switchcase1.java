//write a java program in java to print days along day number

package ConditionalStatements;
import java.util.Scanner;
public class switchcase1 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter day name");
		String dayname= scan.nextLine().toLowerCase();
		
		int day=0;
		switch(dayname) {
		case "Sunday":
			day =1;
			System.out.println("day number"+day);
			break;
		case "monday":
			day=2;
			System.out.println("day number"+day);
			break;
		case "tuesday":
			day=3;
			System.out.println("day number"+day);
			break;
		case "wednesday":
			day=4;
			System.out.println("day number"+day);
			break;
		case "thursday":
			day=5;
			System.out.println("day number"+day);
			break;
		case "friday":
			day=6;
			System.out.println("day number"+day);
			break;
		case "saturday":
			day=7;
			System.out.println("day number"+day);
			break;
			
			default:
				System.out.println("no match found");
		} 
		scan.close();

	}

}
