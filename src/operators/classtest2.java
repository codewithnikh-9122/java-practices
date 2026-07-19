//Q1.write a java program to accept two numbers and perform all arithmetic operations.
//package operators;
//import java.util.Scanner;
//
//public class classtest2 {
//	
//	public static void main(String[] args) {
//	Scanner scan=new Scanner(System.in);
//	System.out.println("enter first number");
//	int num1=scan.nextInt();
//	System.out.println("enter second number");
//	int num2=scan.nextInt();
//	
//	long addition=num1+num2;
//	long sub=num1-num2;
//	long multiplication=num1*num2;
//	long division=num1/num2;
//	long modulo=num1%num2;
//	
//	System.out.println("addition is ;"+addition);
//	System.out.println("substraction is ;"+sub);
//	System.out.println("multiplication is ;"+multiplication);
//	System.out.println("division is ;"+division);
//	System.out.println("modulo is ;"+modulo);
//	scan.close();
//
//	}
//
//}

          
//Q2.write a java program to accept marks of 5 subjects and calculate total,average,grade
//package operators;
//import java.util.Scanner;
//public class classtest2 {
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter marks in sub1");
//		int mark1=scan.nextInt();
//		
//		System.out.println("enter marks in sub2");
//		int mark2=scan.nextInt();
//		
//		System.out.println("enter marks in sub3");
//		int mark3=scan.nextInt();
//		
//		System.out.println("enter marks in sub4");
//		int mark4=scan.nextInt();
//		
//		System.out.println("enter marks in sub5");
//		int mark5=scan.nextInt();
//		
//		int total=mark1+mark2+mark3+mark4+mark5;
//		int avg=total/5;
//		
//		
//		System.out.println("total marks of a student is: "+total);
//		System.out.println("average of student is: " +avg);
//		
//		if(avg<=90) 
//			System.out.println("Grade =A+");
//		else if(avg<=80)	
//			System.out.println("Grade = A");
//		else if(avg<=70)
//			System.out.println("Grade =B+");
//		else if(avg<=60)
//			System.out.println("Grade = B");
//		else if(avg<=50)
//			System.out.println("Grade = C ");
//		else 
//			System.out.println("grade = f");
//			
//		scan.close();
//	}
//}



 // Q3.accept  temperature in celcius and convert to ferenhiet


//package operators;
//import java.util.Scanner;
//public class classtest2 {
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the temperature in celsius");
//		double celcius=scan.nextDouble();
//		
//		double ferenheit=((celcius * 9/5)+32);
//		
//		System.out.println("temperature is:" +ferenheit);
//		scan.close();
//	}
//}



//Q4 .accept a character and determine weather it is uppercase, lowecase , digit, or special character
 						// 1st method to solve this problem

//package operators; 
//import java.util.Scanner;
//public class classtest2 {       
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the character");
//		char ch=scan.next().charAt(0);
//		
//		if(ch>='A' && ch<='Z') {
//			System.out.println("character is UPPERCASE");}
//		else if (ch>='a' && ch<='z') {
//			System.out.println("character is lowercase");}
//		else if(ch>='0' && ch<='9') {
//			System.out.println("charecter is digit");}
//		else {
//			System.out.println("charecter is special character");
//		}
		
		
		
		//2ND METHOD
		
		
//		
//		if (Character.isUpperCase(ch)) {
//			System.out.println("characrter is in UPPERCASE");
//		}
//		else if(Character.isLowerCase(ch)) {
//			System.out.println("character is in lowercase");
//		}
//		else if(Character.isDigit(ch)) {
//			System.out.println("character is digit");
//			
//		}
//		else {
//			System.out.println("character is special character");
//		}
//		
//		scan.close();
//	}
//}

//Q5. build a simple calculater using switch

//package operators; 
//import java.util.Scanner;
//
//
//public class classtest2 {       
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("ENTER FIRST NUMBER");
//		int num1=scan.nextInt();
//		System.out.println("enter symbol from(+,_,*,/,%)");
//		char symbol = scan.next().charAt(0);
//		System.out.println("ENTER SECOND NUMBER");
//		int num2=scan.nextInt();
//		
//		int result=0;
//		switch(symbol) {
//		case '+':
//			result=num1+num2;
//			System.out.println("sum of "+num1+" and "+num2+" is :"+result);
//			break;
//			
//		case '-':
//		 if(num1>num2) {
//			 result=num1-num2;
//			 System.out.println("sub of "+num1+" and "+num2+" is :"+result);
//		 }else {
//			 result=num2-num1;
//		  System.out.println("sub of "+num2+" and "+num1+" is :"+result);
//		  break;
//		 }
//		case '*':
//			result=num1*num2;
//			System.out.println("modulo is "+result);
//			break;
//		case '/':
//			result=num1/num2;
//			System.out.println("division is "+result);
//			break;
//		case '%':
//			result=num1%num2;
//			System.out.println("product is "+result);
//			break;
//		
//	}scan.close();
//	}}
