package StringClass;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " I am a good girl";
		String[] nameArray = str.split(" ");
		String[] temp = new String[nameArray.length];
		for(int i = 0;i<=nameArray.length/2;i++){
			temp[i]=nameArray[nameArray.length-i-1];
			temp[nameArray.length-i-1]= nameArray[i];
		}
		System.out.println(Arrays.toString(temp));
	}

}
