//left face right angle triangle
package loopPattern;
import java.util.Scanner;
public class leftfacetriangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int n=scan.nextInt();
			for(int row=1; row<=n; row++) {
				for(int space=1;space<=(n-row);space++) {
					System.out.print(" "+" ");
				}
				for(int star=1;star<=row;star++) {
					System.out.print("*"+" ");
				}
				System.out.println();
			}
		
	}

}
