package linkedlistProblems;

public class merginglinkedlist {

	public Node mergeList(Node l1, Node l2) {

		Node f1 = l1;
		Node f2 = l2;
		Node merged = new Node(0);
		Node fakehead = merged;

		while (f1 != null && f2 != null) {

			if (f1.data <= f2.data) {

				merged.next = f1;
				f1 = f1.next;

			} else {

				merged.next = f2;
				f2 = f2.next;

			}

			merged = merged.next;

		}
		return fakehead.next;

	}
	
	public void displayList(Node merge) {
		Node temp = merge;
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

}
