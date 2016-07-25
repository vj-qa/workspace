import java.util.Arrays;
import java.util.Scanner;


public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to find if its an Armstrong number or not..");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] digits = input.toCharArray();
		System.out.println(Arrays.toString(digits));
		int power = digits.length;
		int sumOfDigits = 0;
		for (int i =0; i<digits.length;i++){
			int s =  Character.getNumericValue(digits[i]);
			sumOfDigits+= Math.pow(s,power);

		}
		
		if(Integer.valueOf(input) == sumOfDigits){
			System.out.printf("The number %s is an Armstrong number \nSum of Digits is %d", input,sumOfDigits);
		}else System.out.println(input + " is not an Armstrong number"+ "\nsum of Digits is "+sumOfDigits);
	}

}
