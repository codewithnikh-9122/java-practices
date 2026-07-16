package ConditionalStatements;
import java.util.Scanner;
public class electricbill {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of unit consumed ");
		int consumedunit=scan.nextInt();
		
		
		if(consumedunit>=500) {
			System.out.println("bill is calculated using commercial rate");
		}else if(consumedunit<500 && consumedunit>=300){
			System.out.println("bill is calculated as high domesticrate");
		}else if(consumedunit>=100 && consumedunit<300){
			System.out.println("bill is calcularted as normal domestic rate");
		}else {
			System.out.println("bill is calculated as low domestic rate");
		}
		
		
		
		
		
		
		scan.close();

	}

}
