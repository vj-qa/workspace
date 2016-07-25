package StringClass;

import java.util.Arrays;


public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am a good girl";
		String[] strArray = str.split(" ");

		String[] finalString =new String[strArray.length];
		for (int j =0;j<strArray.length;j++){
			String[] newtemp= strArray[j].split("");
			String[] temp=new String[newtemp.length];
			for ( int i =0; i<newtemp.length;i++){
				temp[i]=newtemp[newtemp.length-i-1];
			}
			finalString[j]= Arrays.toString(temp).replaceAll("\\[|,\\s", "").replaceAll("\\]", " ");;
		}
		for(String x : finalString){

			System.out.print(x);


		}
	}
}


