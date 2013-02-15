
public class WordPlay {
	
	
	
	public static String first(String s){
		return s.substring(0,1);
	}
	
	public static String last(String s){
		return s.substring(s.length() -1);
	}
	
	public static String middle(String s){
		return s.substring(1, s.length() -1);
	}
	
	public static boolean isPalindrome(String s){
		
		String firstLetter = first(s);
		String lastLetter = last(s);
		
		
		//if (s.length() > 2){
		if(firstLetter.equals(lastLetter)){
				
		String middleString = middle(s);
		System.out.println(middleString);
				
			
		if(middleString.length() > 1){
			return isPalindrome(middleString);
		}
		
		else{return true;}
		}
		return false;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam im adam";
		//System.out.println(first(s));
		//System.out.println(last(s));
		//System.out.println(middle(s));
		System.out.println(isPalindrome(s));
	}

}
