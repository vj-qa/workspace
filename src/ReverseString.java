import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Enter a number or String to reverse...");
		Scanner in = new Scanner(System.in);
		char[] input = in.nextLine().toCharArray();
		char[] temp = new char[input.length];
		for(int i =0; i<input.length;i++){
			temp[i]  = input[input.length-i-1];
		}
		System.out.println(temp);
	}

}
