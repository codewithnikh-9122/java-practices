package basics;
import java.util.Scanner;
public class hello {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter first name");
		String first=scan.next();
		
		System.out.println("enter second name");
		String second=scan.next();
		
		String fullname= first+" "+second;
		System.out.println(fullname);

	}

}
