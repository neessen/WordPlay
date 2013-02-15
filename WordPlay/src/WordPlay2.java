
public class WordPlay2 {

	public static boolean isPalindrome(String s){
		if(s.length() < 2)
			{return true;}
		
		if(!s.substring(0,1).equals(s.substring(s.length()-1))){return false;}
			
		return isPalindrome(s.substring(1, s.length() -1));
	}
	
	/*
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("aaddaa"));
		System.out.println(isPalindrome("aaddaaff"));
		
	}

}
