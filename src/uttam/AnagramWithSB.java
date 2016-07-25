package uttam;

public class AnagramWithSB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			String s = "act";
			String s1 = "cat";
			String result = isAnagram(s, s1)?s1+" and "+s+" are anagrams": s1+" and "+s+"  are not anagrams";
			System.out.println(result);
		}

		private static boolean isAnagram(String s, String s1) {
			// TODO Auto-generated method stub
			boolean result=false;
			StringBuilder sb = new StringBuilder(s);
			if(s.length()!= s1.length() ||s==null||s1== null|| s.equals("")||s1.equals("")||s.isEmpty()||s1.isEmpty()){
				System.out.println("Error: Strings should not be empty or different length");
				return false;
				
				
			}
					
			for(int i =0; i<s.length();i++){
			
					
			
				
							if(s.indexOf(s1.charAt(i))>-1){
								sb.deleteCharAt(sb.indexOf(String.valueOf(s1.charAt(i)), 0));
							}
						
						
							
				
			
		}
			result = sb.length()==0?true:false;
			return result;
		}
	}


