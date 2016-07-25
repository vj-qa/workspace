
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  fromNum = 1; 
		int toNum = 100;
		for(int i =fromNum; i<=toNum; i++){
			if((i%2)==0){
				System.out.println(i +" is even");
			}else System.out.println(i+" is odd");
		}
	}

}
