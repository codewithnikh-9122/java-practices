package basics;
import java.util.Scanner;
public class inputstatement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter then id of the user");
	    int userId=scan.nextInt();
	    scan.nextLine();
	    System.out.println("enter the name of the user");
	    String name=scan.nextLine();
	    System.out.println("enter the age");
	    int age= scan.nextInt();
	    
	    
	    
	    System.out.println(userId);
	    System.out.println(name);
	    System.out.println(age);
	    
	    
	    

	} 
	
}
