package ConditionalStatements;
import java.util.Scanner;
public class onlineshoppingdiscountsystem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the purchage amount");
		double purchageamount=scan.nextDouble();
		double discount=0;
		double finalbill=0;
		if(purchageamount>=10000) {
			discount=purchageamount*0.2;
			finalbill=purchageamount-discount;
			
			
		
		}else if(purchageamount>=5000 && purchageamount<10000){
			discount=purchageamount*0.1;
			finalbill=purchageamount-discount;
			
			
			
		}else {
			finalbill=purchageamount;
		}
		
		System.out.println("finalbill="+finalbill);
		
		
		
		
		scan.close();
		
	}

}
