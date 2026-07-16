package ConditionalStatements;
import java.util.Scanner;
	public class job{
		public static void main(String[] args){
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the persons experience:");
			int experience=scan.nextInt();
			System.out.println("enter the persons CTC:");
			double CTC=scan.nextDouble();
			double bonus;
			double revisedsalary;
			
			if (experience <2) {
				bonus=0;
				revisedsalary =CTC;
			}
			else if(experience>=2 && experience<5) {
				bonus=CTC*0.1;
				revisedsalary= CTC+bonus;
				
			} else if(experience>=5 && experience<=10 ) {
				bonus=CTC*0.2;
				revisedsalary=CTC+bonus;
			}
			else {
				bonus=CTC*0.35;
				revisedsalary=CTC+bonus;
			}
			System.out.println("Revised Salary"+revisedsalary);
			scan.close();
		}
		
	}
