package week2;

import java.util.Scanner;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	int[] myArray = new int[5];
	for ( int i = 0 ; i<5;i++){
		int num = i+1;
		System.out.println("\nEnter the number :"+num);
		myArray[i]=in.nextInt();
	}
	System.out.println();
	int num = 1;
	for( int x : myArray){
		
		System.out.println("Value of the number "+num+ " is "+x);
		num++;
	}


	for ( int j = 0; j<myArray.length-1;j++ ){
		
		for(int x= 0;x< myArray.length-j-1;x++){
		
			if ( myArray[x]>myArray[x+1]){
				int temp = myArray[x];
	
	myArray[x]= myArray[x+1]; 
				myArray[x+1]=temp;
				
			}
		}
	}
	num = 1;
	System.out.println(" After the Bubble sort the result is : ");
	for( int x : myArray){
		
		System.out.println("Value of the number "+num+ " is "+x);
		num++;
	}
	}

}
