import java.util.Arrays;
import java.util.Scanner;


public class CalculatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a mathematical expression to calculate");
		String expression = in.nextLine();
		String[] nums = expression.split("[^0-9]");	
		String[] operators = expression.split("[0-9]");	
		int num1 = Integer.valueOf(nums[0]);
		int num2 = Integer.valueOf(nums[1]);
		String operator = operators[operators.length-1];
		System.out.println("Evaluating..." +num1+ " "+operator+" "+num2+ " ");
		double result = calculate(num1, num2, operator);
		System.out.println("The result of the expression  : "+result);
		
		

}
	static double calculate(int num1, int num2, String operator){
		double result=0;
		switch(operator){
		case "*":
			result= num1* num2;
			break;
		case "-":

			result= num1- num2;
			break;
		case "+":

			result= num1+ num2;
			break;
		case "/":
			if(num2 ==0){
				System.out.println("Division by zero is undefined");
			}else{
			result=  num1/num2;
			}
			break;
		
		}
		return result ;
	}
}