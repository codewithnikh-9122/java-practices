package operators;
import java.util.Scanner;
public class salarycalculation {
 
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the basic salary");
		double BasicSalary=scan.nextDouble();
		
		System.out.println("Enter HRA percentage");
		double HRApercentage=scan.nextDouble();
		
		System.out.println("Enter the DA percentage");
		double DApercentage=scan.nextDouble();
		
		System.out.println("Enter the proffesional tax");
		double professionalTax=scan.nextDouble();
		
		double HRA=(BasicSalary * HRApercentage)/100;
		double DA=(BasicSalary* DApercentage)/100;
		double Grosssalary=(BasicSalary+HRA+DA);
		double NetSalary=(Grosssalary-professionalTax);
		
		
		System.out.println("The HRA of Employee is: "+HRA);
		System.out.println("The DA of employee is: "+DA);
		System.out.println("The Gross salary of employee:" +Grosssalary);
		System.out.println("The Net Salary of employee is :"+NetSalary);
		
		scan.close();
	}

}
