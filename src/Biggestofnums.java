
public class Biggestofnums {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {1,6,3,7, 5,4,9,8,5,2,4};
		
		int biggest = 0;
		int bigger = 0;
		int temp = 0;
		for(int x = 0;x<myArray.length-1;x++){
			
			temp = biggest;
			biggest = findBigger(myArray[x],myArray[x+1], biggest );
			
			if(temp!=biggest){
				bigger= temp;
			}
			if(temp== biggest && bigger<myArray[x] && myArray[x]<biggest) {
				bigger= myArray[x];
			}
			if(temp== biggest &&  bigger<myArray[x+1]&& myArray[x]<biggest) {
				bigger= myArray[x+1];
			}
		}
    

		System.out.println("Biggest :"+biggest+"\nBigger: "+bigger);

	}
	private static int findBigger(int i, int j, int biggest) {
		// TODO Auto-generated method stubj
		int bigger = i>j ?i :j;
		if ( bigger> biggest ){
			biggest= bigger;
			}

		return biggest;
	}

	
}

