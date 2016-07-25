
public class Design {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 9;
		int counter = 1;
			for ( int x = (length+1)/2; x<=length;x++){
				for (int j = x-counter; j>=0; j--){
					//System.out.println("j is "+ j);
					System.out.print(" ");
				}
				for (int i =1;i<=counter;i++){
						
				System.out.print("*");
				}
				
				System.out.println();
				counter+=2;
			}
			counter = length-2;
			
			// length = 9, counter is 7 , j = 1, i = 7, x=8
			for ( int x = (length-1); x>=(length+1)/2; x--){
				System.out.print(" ");
				for (int j = 1; j<=x-counter; j++){
					//System.out.println("j is "+ j);
					System.out.print(" ");
				}	
				
				for (int i =counter;i>=1;i--){
						
				System.out.print("*");
				}
				counter-=2;
				System.out.println();
			}
	}

}
