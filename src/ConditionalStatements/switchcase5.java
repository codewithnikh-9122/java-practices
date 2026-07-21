/*Program-2: An electricity distribution company wants to categorize 
  its consumers based on the type of electricity connection. 
  Different tariff rates are applied depending on the selected connection type.
  When the customer visits the billing system, 
  they are asked to select the type of electricity connection from the following menu:
   1. Domestic 
   2. Commercial 
   3. Industrial
   
  the system should perform the following operations: 
  1. If the consumer selects "1", display "Domestic Connection selected" 
  and inform the user that electricity tariff will be applied. 
  
  2. If the consumer selects "2", display "Commercial Connection selected" 
  and inform the user that electricity tariff will be applied. 
  
  3. If the consumer selects "3", display "Industrial Connection selected" 
  and inform the user that electricity tariff will be applied. 
  
  4. If the consumer enters any value other than "1, 2 or 3", display 
  "Invalid Connection Type. Please valid option".
   
 */



package ConditionalStatements;
import java.util.Scanner;
public class switchcase5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter '1' for DOMESTIC CONNECTIONS TYPE");
		System.out.println("Enter '2' for COMMERCIAL CONNECTION TYPE");
		System.out.println("ENter '3' for INDUSTRAIL CONNECTION TYPE");
		
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Domestic connection selected");
			break;
		case 2:
			System.out.println("Commercial connection selected");
			break;
		case 3:
			System.out.println("Industrail connection selected");
		break;
		
		
		default:
			System.out.println("Invalid Connection Type. Please valid option");
		
		}
		
			
			
		scan.close();

	}

}
