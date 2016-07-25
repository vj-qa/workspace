import java.util.Scanner;


public class AsciiCodeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to find its ASCII: ");
		char char1=sc.next().charAt(0);
		int asc = (int) char1;
		System.out.println("The ASCII of the character is : "+asc);
		System.out.println("Enter a ASCII code to find value: ");
		asc =sc.nextInt();
		char1= (char) asc;
		System.out.println("The value of the  ASCII is : "+char1);
	}

}
