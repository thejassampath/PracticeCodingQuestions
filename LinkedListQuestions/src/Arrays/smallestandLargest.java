package Arrays;

public class smallestandLargest {

	public void largeSmall(int[] numbers) {
		int smallest = Integer.MIN_VALUE;
		int largest = Integer.MAX_VALUE;

		for (int number : numbers) {
			if (number > largest) {

				largest = number;
			} else {

				smallest = number;

			}

		}

		System.out.println("Largest" + largest + "        " + "Smallest" + smallest);

	}

	public static void main(String args[]) {
		smallestandLargest sl = new smallestandLargest();
		int[] numbers = { 2, 23, 45, 1, 99 };
		sl.largeSmall(numbers);

	}

}
