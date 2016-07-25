
import java.util.Arrays;

public class FindCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Madhu12";

		int numberOfInts =0;
		int numberOfCaps = 0;
		int numberOfLow = 0;

		for(int i = 0; i<str1.length();i++){
			if (Character.isDigit(str1.charAt(i))){
				numberOfInts+=1;
			}else{
				if (Character.isLowerCase(str1.charAt(i))){

					numberOfLow += 1;
				}

				if (Character.isUpperCase(str1.charAt(i))){
					numberOfCaps += 1;

				}
			}

		}
		System.out.printf("The number of uppercase letters in '%s' is %d"+
				" \nThe number of lowercase letters '%s' is %d "+
				"\nThe number of digits in the '%s' is %d",
				str1, numberOfCaps,str1, numberOfLow,str1, numberOfInts);

	}

}
