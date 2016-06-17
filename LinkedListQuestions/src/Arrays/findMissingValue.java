package Arrays;

import java.util.BitSet;

public class findMissingValue {

	// when u need to find only one missing value
	public int findMissingNumber(int[] numbers, int count) {

		int expectedSum = (count * (count + 1) / 2);
		int actualSum = 0;
		for (int number : numbers) {
			actualSum = actualSum + number;

		}

		int missingValue = expectedSum - actualSum;
		return missingValue;
	}

	public int findMissingNumbers(int[] numbers, int count) {

		int missingCount = count - numbers.length;
		BitSet bs = new BitSet(count);
		for (int value : numbers) {

			bs.set(value - 1);

		}
		int missingIndex = 0;

		for (int i = 0; i < missingCount; i++) {

			missingIndex = bs.nextClearBit(missingIndex);
			System.out.println(++missingIndex);
		}

		return count;
	}
}
