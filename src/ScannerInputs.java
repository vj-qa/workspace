import java.util.Scanner;


public class ScannerInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		///nextLine() reads string as input
		//next int takes int
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int num =Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		System.out.println(s1+s2);
		System.out.println((num+num2));

	}

}
