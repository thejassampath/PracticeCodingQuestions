package StringProblems;

public class checkIfStringIsUnique {
	
	//efficient method using boolean
	public boolean ifUnique(String input){
		
		boolean[] tocheck = new boolean[256];
		
		for(int i=0;i<input.length();i++){
			
			int charifpresent=input.charAt(i);
			
			if(tocheck[charifpresent]== true){
				
				return false;
			}
			else{
				
				tocheck[charifpresent]=true;
				
			}
			
			
			
		}
		
		return true;
		
		
	}
	

}
