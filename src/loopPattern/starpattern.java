// write a java program to print a Star pattern (Square pattern)

package loopPattern;

public class starpattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
