import java.util.Scanner;

public class PalindromeCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 	next() will return space-delimited strings
		 */

		System.out.println("Enter a number or string to find if its a palindrome..");
		Scanner sc = new Scanner(System.in);
		String stringArray = sc.nextLine().toLowerCase();
		char[] charsArray	= stringArray.replaceAll(" ", "").toCharArray();
		System.out.println(stringArray.toString().toCharArray());
		for( int i = 0; i<charsArray.length/2; i++){
			System.out.println(i);
			if (charsArray[i]==charsArray[charsArray.length - i-1])
			{
				if ( i == ((charsArray.length/2)-1)){
					System.out.println(" This is a plaindrome ! ");
				}else continue;
			}
			else
			{
				System.out.println("This is not a palindrome!!");
				break;
			}
		}
	}

}

