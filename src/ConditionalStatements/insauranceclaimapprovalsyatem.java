package ConditionalStatements;
import java.util.Scanner;

public class insauranceclaimapprovalsyatem {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("status of policy if active then true otherwise false");
		boolean policyactive=scan.nextBoolean();
		
		
		
		
		
		if(policyactive) {
			System.out.println("premium is paid if paid true otherwise false");
			boolean premium=scan.nextBoolean();
			if (premium) {
				System.out.println("status of verified documents");
				boolean documents=scan.nextBoolean();
				if (documents) {
				    System.out.println("claim request is approved");
				    System.out.println("claim is forwaded to settelment process");
				}else {
					System.out.println("claim request is rejected due to incomplete documentation");
				}
			}else {
				System.out.println("claim request is reject dut to premium is pending");
			}
		}else {
			System.out.println("claim request is rejected due to inactive policy");
		}
		
		
		scan.close();
	}
}
