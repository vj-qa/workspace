

public class FindLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num1 = 336;
 int num2 = 224;
 
 int lcm = findLCM( num2, num1);
 System.out.printf("LCM of %d and %d is %d ",num1, num2,lcm);
	}

	private static int findLCM(int num1, int num2) {
		// TODO Auto-generated method stub
		int lcm = 0;
		for(int i = 1; i<= (num1*num2)/num1;i++){
			if(( num1*i)%num2 == 0){
				lcm = num1*i;
				break;
			}
			
		}
		return lcm;
	}

}
