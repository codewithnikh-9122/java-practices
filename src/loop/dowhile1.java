/*program-1: (Students Result Management System)
(A college wants to automate the process of managing student Results. 
The application should allow the user to enter the marks of a student,
calculate the total and average marks, determine whether the student 
has passed or failed, and display the complete result. 
Since the college staff may need to perform these operations multiple times,
the application should repeatedly display a menu until 
the user chooses to exit. Use a menu-driven application implemented with
a do-while and switch statements)
*/
package loop;

import java.util.Scanner;
public class dowhile1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sub1=0,sub2=0,sub3=0,sub4=0,sub5=0;
		
		int Total =0;
		double avg=0.0;
		String result="";       //pass/fail
		 int choice=0;
		 
		 
		 do {
			 System.out.println("*****STUDENT RESULT MANAGEMENT SYSTEM*****");
			 
			 System.out.println("1.enter student marks");
			 System.out.println("2.calculate total");
			 System.out.println("3.calculate average");
			 System.out.println("4.Display result");
			 System.out.println("5.Exit");
			 
			 System.out.println("enter your choice :");
			 choice = scan.nextInt();
			 
			 switch (choice) {
			 case 1:
				 System.out.println("enter sub1 mark");
				 sub1=scan.nextInt();
				 System.out.println("enter sub2 mark");
				 sub2=scan.nextInt();
				 System.out.println("enter sub3 mark");
				 sub3=scan.nextInt();
				 System.out.println("ente sub4 mark");
				 sub4=scan.nextInt();
				 System.out.println("enter sub5 mark");
				 sub5=scan.nextInt();
				 
				 if (sub1<0 || sub1>100
						 || sub2<0 || sub2>100 
						 || sub3<0 || sub3>100
						 || sub4<0 || sub4>100
						 || sub5<0 || sub5>100) {
					 System.out.println("marks should be between 0 and 100");
				 } else {
					 System.out.println("marks are entered succesfully");
				 }
				
				 break;
			 case 2:
				 Total=sub1+sub2+sub3+sub4+sub5;
				 break;
			 case 3:
				 avg=(double)Total/5;
				 break;
			 case 4:
				 if (avg>=35) {
					 result="pass";
					 
				 }else {
					 result="fail";
				 }
				 System.out.println("=====student result=====");
				 System.out.println("marks of sub1:"+sub1);
				 System.out.println("marks of sub2:"+sub2);
				 System.out.println("marks of sub3:"+sub3);
				 System.out.println("marks of sub4:"+sub4);
				 System.out.println("marks of sub5:"+sub5);
				 
				 System.out.println("-----------------------------");
				 System.out.println("Total mark:"+Total);
				 System.out.println("Average is:"+avg);
				 System.out.println("Result is:"+result);
				 break;
			 case 5:
				 System.out.println("thanks for visiting");
				 break;
				 default :
					 System.out.println("please enter valid options");
			 }
			
		 }while(choice !=5);
		 System.out.println("exit");
		 
		 scan.close();
		
	}
	
}
