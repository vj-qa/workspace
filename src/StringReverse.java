package StringClass;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " I am a good girl";
		String[] strArray = str.split("");
		String[] temp = new String[strArray.length];
		for ( int i =0; i<strArray.length/2;i++){
			temp[i]=strArray[strArray.length-i-1];
			temp[strArray.length-i-1]=strArray[i];
		}
for(String x : temp){
	System.out.print(x);

	
}
}
}
