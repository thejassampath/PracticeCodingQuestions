package testPackage;
import Arrays.*;


public class arrayTest {
	public static void main (String[] args){
		removeDuplicatesFromArray u = new removeDuplicatesFromArray();
		int[] a = {1,2,3,3,4,5,5};
		System.out.println("Duplicates"+u.removeDuplicates(a));
		int[] number={1,2,4,6,7,8,9,10};
		int count=10;
		findMissingValue fm = new findMissingValue();
		fm.findMissingNumbers(number, count);
	}
		


}
