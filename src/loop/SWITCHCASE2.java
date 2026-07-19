//write a java program to define menu driven calculator using switch statement
package loop;
import java.util.Scanner;
public class SWITCHCASE2 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the 1st number");
	int num=scan.nextInt();
	System.out.println("enter the 2nd number");
	int num2=scan.nextInt();
	System.out.println("Enter the symbol from(+, -, *, /, %):");
	char symbol = scan.next().charAt(0);
	
	int result =0;
	switch (symbol) {
	case'+':
		result=num+num2;
		System.out.println("sum of "+num +" and "+num2 +" is = "+result);
		break;
		
	case '-':
		if(num>num2) {
			result=num-num2;
			System.out.println("subtraction of "+num +" and "+num2 +" is = "+result);
		}else {
			result=num2-num;
			System.out.println("subtraction of "+num2+" and "+num+" is="+result );
			break;
		}
	case '*':
		result=num*num2;
		System.out.println("multiplication of "+num+" and "+num2+" :"+result);
		break;
		
	case '/':
		if(num>num2) {
			result=num/num2;
			System.out.println("Quotient of "+num+" and "+num2+" :"+result);
			
		}else{
			result=num2/num;
			System.out.println("Quotient of "+num2+" and "+num+" :"+result);
		break;
		}
	case '%':
		if(num>num2) {
			result=num%num2;
			System.out.println("remainder of "+num+" and "+num2+" :"+result);
		}else {
			result=num2%num;
			System.out.println("remainder of "+num2+" and "+num+" :"+result);
		}
		break;
	default:
		System.out.println("invalid operations");
	}
	scan.close();

	}

}
