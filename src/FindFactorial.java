import java.util.Scanner;


public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to find its factoriaL");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int factorial = findFactorial( number);
		System.out.printf("Factorial of the %d is %d",number, factorial );
	}

	private static int findFactorial(int number) {
		// TODO Auto-generated method stub
		if (number ==1){
			return 1;
		}

		int factorial= number*findFactorial(number-1);

		return factorial;
	}

}
