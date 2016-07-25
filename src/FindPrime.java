import java.util.Scanner;


public class FindPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		checkPrime( number);

	}

	private static void checkPrime(int number) {
		
		// TODO Auto-generated method stub
		if(number ==2 ){
			System.out.println("2 is the only even prime number!!");
		}
		else if(number ==3  ){
			System.out.printf("%d is a prime number!!", number);
		}
		else if( number ==1 ){
			System.out.printf("%d is not a prime number!!", number);
		}
		if (number> 3){
		for(int i = 2 ; i<= number/2;i++){
			
			if (number%i == 0){
				System.out.printf("%d is not a PRIME NUMBER!",number);
				break;
			}
			if (i == (number/2) ){
				System.out.printf("%d is a PRIME NUMBER!!",number);
			}
		}
		}
	}

}
