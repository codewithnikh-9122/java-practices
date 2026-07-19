package operators; 
import java.util.Scanner;


public class marks {       
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER");
		int num1=scan.nextInt();
		System.out.println("enter symbol from(+,_,*,/,%)");
		char symbol = scan.next().charAt(0);
		System.out.println("ENTER SECOND NUMBER");
		int num2=scan.nextInt();
		
		int result=0;
		switch(symbol) {
		case '+':
			result=num1+num2;
			System.out.println("sum of "+num1+" and "+num2+" is :"+result);
			break;
			
		case '-':
		 if(num1>num2) {
			 result=num1-num2;
			 System.out.println("sub of "+num1+" and "+num2+" is :"+result);
		 }else {
			 result=num2-num1;
		  System.out.println("sub of "+num2+" and "+num1+" is :"+result);
		  break;
		 }
		case '*':
			result=num1*num2;
			System.out.println("modulo is "+result);
			break;
		case '/':
			result=num1/num2;
			System.out.println("division is "+result);
			break;
		case '%':
			result=num1%num2;
			System.out.println("product is "+result);
			break;
		
	}scan.close();
	}}
