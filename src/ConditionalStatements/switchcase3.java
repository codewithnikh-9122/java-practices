//write a java program to check weather the character is vowel or consonent. 


package ConditionalStatements;
import java.util.Scanner;
public class switchcase3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=scan.next().toLowerCase().charAt(0);
		if(Character.isLetter(ch)) {
			switch(ch) {
			
			
			
			/*case 'a':
				System.out.println(ch+ " is a vowel");
				break;
				
			case 'e':
				System.out.println(ch+ "is vowel");
				break;
			case 'i':
				System.out.println(ch+ "is vowel");
				break;
			case 'o':
				System.out.println(ch+ "is vowel");
				break;
			case 'u':
				System.out.println(ch+ "is vowel");
				break;
				default:
					System.out.println(ch+" is consonent");
					break;
		
			}
			}else {
				System.out.println("vowel and consonent check is not possible");
				
		}
		*/
		
			//***fall on through condition***//
			
			case'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
		
		System.out.println(ch+ ":is a vowel");
		break;
		default:
			System.out.println(ch+" :is consonent");
			}
		}else {
			System.out.println("vowel and consonent check is not possible");
			}
		
		
		scan.close();
		

	}

}
