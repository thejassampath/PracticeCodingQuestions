package linkedlistProblems;

public class findingIntersection {

	int count = 0;

	public int count(Node head) {

		Node current = head;
		while (current != null) {

			current = current.next;
			count++;
		}
		return count;

	}

	public int findPointOfMerging(int length1, int length2, Node head1, Node head2) {
		int difference = 0;
		if (length1 > length2) {

			difference = length1 - length2;
			return nodeOfIntersection(difference, head1, head2);

		} else {

			difference = length2 - length1;

			return nodeOfIntersection(difference, head2, head1);
		}

	}

	public int nodeOfIntersection(int difference, Node head1, Node head2) {
		Node current1 = head1;
		Node current2 = head2;

		for (int i = 0; i < difference; i++) {

			current1 = current1.next;

		}
		while (current1 != null && current2 != null) {
			if (current1.data == current2.data) {

				System.out.println("merge"+current1.data);
				return current1.data;

			}
			current1 = current1.next;
            current2 = current2.next;

		}

		return -1;
	}

}
