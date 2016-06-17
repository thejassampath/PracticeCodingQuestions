package Arrays;

import java.util.Arrays;

public class reverseAnArray {

	public int[] reverseArray(int[] arrayOfNumbers) {

		for (int i = 0; i < arrayOfNumbers.length / 2; i++) {

			int temp = arrayOfNumbers[i];
			arrayOfNumbers[i] = arrayOfNumbers[arrayOfNumbers.length - i - 1];
			arrayOfNumbers[arrayOfNumbers.length - i - 1] = temp;

		}

		return arrayOfNumbers;

	}

	public static void main(String args[]) {

		reverseAnArray reverseArray = new reverseAnArray();
		int a[]={1,2,3,4,5};
		a=reverseArray.reverseArray(a);
		System.out.println(Arrays.toString(a));

	}

}
