import java.util.ArrayList;
import java.util.Scanner;


public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		//Scanner in = new Scanner (System.in);
		
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		
		for(int i = 1; i<100; i++){
			myArrayList.add(i) ;

		}
		
		System.out.println(addNums(myArrayList.toArray(new Integer[myArrayList.size()])));
		
	}
	
	private static int addNums(Integer ... nums){
		
		int sum= 0;
		if (nums.length==1){
			return nums[0];
		}
		for (int num : nums){
			sum = sum+num;
		}
		return sum;
		
		
	}

}


