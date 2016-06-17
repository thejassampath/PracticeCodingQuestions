package linkedlistProblems;

public class LinkedList {
	Node head;
	public Node head1;
	public Node head2;

	public int getHead() {

		if (head != null) {

			
		} 

		return head.data;
	}

	// For Displaying the list
	public void displayList() {
		Node temp = head;
		if (temp == null) {
			System.out.println("Linked list is empty");
			return;
		}
		while (temp.next != null) {
			System.out.print(temp.data + "\t==>\t");
			temp = temp.next;

		}
		System.out.print(temp.data + "\t==>\n");
	}

	// Inserting into the head of linked list
	public void insertIntoHead(int data) {

		Node newData = new Node(data);
		if (head == null) {

			head = newData;

		} else {

			newData.next = head;
			head = newData;

		}

	}

}
