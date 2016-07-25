package uttam;

public class findAnagram {

	public static void main(String[] args) {
		String s = "";
		String s1 = "";
		String result = isAnagram(s, s1)?s1+" and "+s+" are anagrams": s1+" and "+s+"  are not anagrams";
		System.out.println(result);
	}

	private static boolean isAnagram(String s, String s1) {
		// TODO Auto-generated method stub
		boolean result=false;
		char[] cs = s.toCharArray();
		char[] cs1 = s1.toCharArray();
		for(int i =0; i<=s.length();i++){
			if(s.length()!= s1.length() ||s==null||s1== null|| s.equals("")||s1.equals("")||s.isEmpty()||s1.isEmpty()){
				System.out.println("Error: Strings should not be empty or different length");
				break;
			}
				
		
			
			if (s.indexOf(cs1[i])!=-1){
			
					System.out.println("Index of "+cs1[i]+  "in "+s+":"+s.indexOf(cs1[i])); 
					if (s1.indexOf(cs[i])!=-1){
						System.out.println("Index of "+cs[i]+  "in "+s1+":"+s1.indexOf(cs[i])); 
						if((i==s.length()-1)){
							result = true;
						}
						continue;
					}
			
				
			}else{
				break;
			}
			
		}
		return result;
	}
}
