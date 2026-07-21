// program 1
/* a bank wants to automate the basic services provided by an ATM . 
  when a customer inserts theirs ATM  card and enter the correct  PIN, the ATM should display
   the following menu,
  
   1. balance enquiry 
   2. cash withdrawal
   3. deposit menoy
   4. mini statement
   
   the customer enter one option from keyword
   the ATM should perform the following operations:
   1.if the customer enters '1' display available account balance
   2.if the customer enter '2' allow the customer to withdraw the money and display a success message
   3.if customer enter '3' allow the customer to deposit money and display a success message 
   4. if the customer enter '4' DISPLAY THE LAST FEW TRANSACTIONS AS A mini statement.
   5. if the customer supports any number other than 1,2,3 or 4 , display "INVALID OPTIONS". PLEASE SELECT A VALID MENU
   
   */





package ConditionalStatements;
import java.util.Scanner;
public class switchcase4 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("welcome to chillar bank service");
	System.out.println("please insert your card");
	System.out.println("please enter your pin");
	int pin=scan.nextInt();
	double accountbalance=10999.0;
	if (pin==2628) {
		System.out.println("enter '1' for balance enquiry :");
		System.out.println("enter '2' for cash withdrawal :");
		System.out.println("enter '3' for deposite money :");
		System.out.println("enter '4' for mini statement:");
		
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("your account balance is :"+accountbalance);
			break;
		case 2:
			System.out.println("enter the amount to withdrawal");
			double withdrawalamount =scan.nextDouble();
			if(withdrawalamount<=accountbalance) {
				accountbalance-=withdrawalamount;
				System.out.println("withdrawal is successful");
				System.out.println("your account balance is "+accountbalance);
			}else {
				System.out.println("insufficient funds");
			}
			break;
		case 3:
			System.out.println("enter '3' for deposite money");
			double depositeamount=scan.nextDouble();
			if(depositeamount>0) {
				accountbalance+=depositeamount;
				System.out.println("deposite is succesful");
				System.out.println("your balance is :"+accountbalance);
			}
			else {
				System.out.println("invalid amount");
			}
			break;
		case 4:
			System.out.println("transfer to UPI account with rs. 5000 is succesfull");
			System.out.println("deposite to XXXXX account is failed");
			System.out.println("10000 rs is recieved");
			
			break;
		default:
			System.out.println("invalid options please select a valid menu");
		}
	}
	else {
		System.out.println("invalid pin");
		System.out.println("enter valid pin");
	}
	
	scan.close();
	}

}
