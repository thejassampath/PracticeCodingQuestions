package testPackage;

import java.util.Scanner;

import javax.naming.CommunicationException;

import StringProblems.*;

public class StringsTest {
	public static void main(String args[]) {
		
		palindromeornot pl = new palindromeornot();
		System.out.println(pl.checkIfPalindrome("edfsf"));
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the option");
//		String option=input.nextLine();
//		if(option=="1"){
//			
			checkIfStringIsUnique cf = new checkIfStringIsUnique();
			System.out.println(cf.ifUnique("yash"));
//			
//		}else if(option=="2"){
//			
//			
//			
//		}
			
			stringsArePalindromeofEachOther st = new stringsArePalindromeofEachOther();
			System.out.println(st.checkIfPalindrome("god", "dog"));
			
			permutationOfAPalinadrome pt = new permutationOfAPalinadrome();
			System.out.println(pt.check("coa"));
			
			
			oneEditAwayString oneedit = new oneEditAwayString();
			System.out.println(oneedit.checkWhichMethodToCall("apple", "bapap"));
			
			compressedString cstring = new compressedString();
			System.out.println(cstring.checkCompressedString("ssssuuuummmmmmiiiittttttttttttt"));;
		System.out.println(cstring.checkCompressedString("Jaain"));
		
		System.out.println("Word Count");
		coutingNumberOfRepeatedWordsInAString counting = new coutingNumberOfRepeatedWordsInAString();
		counting.numberOFWords("Bread is sweet Bread is sweet");
		StringsTest t = new StringsTest();
		System.out.println(t.convertCaps("teja sampath"));
	}
	
	public String convertCaps(String input){
		String[] split = input.split(" ");
		StringBuffer buff = new StringBuffer();
		for(String str : split){
			char[] caps = str.toCharArray();
			caps[0] = Character.toUpperCase(caps[0]);
			String newS = new String(caps);
			buff.append(newS).append(" ");
		}
		return buff.toString();
	}
}
