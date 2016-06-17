package StringProblems;

public class palindromeornot {
	
	public String checkIfPalindrome(String palindrome){
		
		String reverse="";
		for(int i=palindrome.length()-1;i>=0;i--){
			reverse=reverse+palindrome.charAt(i);
			
		}
		if(palindrome.equals(reverse)){
			
			return "Given String palindrome";
			
		}
			
		return "Not a plaindrome";
		
	}
	
}
