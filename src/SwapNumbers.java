
public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println("Before swapping a is "+ a+" and be is "+b);

		//a is now 30
		a= a+b;
		//b is now 30-20 
		b= a-b;
		a = a - b;
		System.out.printf("After swapping a is %d and b is %d",a,b);
		
	}

}
