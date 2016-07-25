
public class Biggestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {1,6,3,7, 5,4,9,8,5,2,4};

		int biggest = 0;
		int bigger = 0;
		int thirdBigger=0;
		for(int i = 0;i<myArray.length-1;i++){
			if (myArray[i]==bigger || myArray[i+1]==bigger ||myArray[i]==biggest || myArray[i+1]==biggest){
				continue;
			}
			for(int x = 0;x<myArray.length-1;x++){
				if (myArray[x]==biggest || myArray[x+1]==biggest){
					continue;
				}
				for(int j = 0;j<myArray.length-1;j++){


					biggest = findBigger(myArray[j],myArray[j+1], biggest );

				}


				bigger = findBigger(myArray[x],myArray[x+1], bigger );


			}
			thirdBigger = findBigger(myArray[i],myArray[i+1], thirdBigger );


		}


		System.out.println("Biggest :"+biggest+"\nBigger: "+bigger+ "\nThirdBigger: "+thirdBigger);
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
