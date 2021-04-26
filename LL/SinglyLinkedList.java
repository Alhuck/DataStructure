package LL;

public class SinglyLinkedList {

	private ListNode head;
	private int length = 0;

	// get length of a linked list
	public int getLength() {
		return length;
	}

	// insert data before head
	public void insertNodeAtHead(ListNode node) {
		node.setNext(head);
		head = node;
		length++;
	}

	// remove data before head
	public void removeDataAtHead() {
		if (head != null) {
			ListNode tmp = head;
			head = tmp.getNext();
			tmp.setNext(null);
			length--;
		}
	}

	// insert data at the end
	public void insertNodeAtEnd(ListNode node) {
		ListNode currentNode = head;
		while (currentNode != null) {
			if (currentNode.getNext() == null) {
				currentNode.setNext(node);
				length++;
				break;
			} else {
				currentNode = currentNode.getNext();
			}
		}
	}

	// remove data at the end
	public void removeNodeAtEnd() {

		ListNode currentNode = head;
		ListNode tmp = null;
		while (currentNode != null) {
			if (currentNode.getNext() != null) {
				tmp = currentNode;
			}
			currentNode = currentNode.getNext();
		}
		tmp.setNext(null);
		length--;
	}

	// insert data at a given position
	public void insertNodeAtPosition(int pos, ListNode node) {

		if (pos < 0) {
			pos = 0;
		}
		if (pos > length) {
			pos = length;
		}
		if (pos == 0) {
			node.setNext(head);
			head = node;
		} else {
			ListNode currentNode = head;
			for (int i = 1; i < pos; i++) {
				currentNode = currentNode.getNext();
			}
			node.setNext(currentNode.getNext());
			currentNode.setNext(node);
		}
		length++;
	}

	// remove data at a given position
	public void removeNodeAtGivenPosition(int pos) {

		if (pos < 0) {
			pos = 0;
		}
		if (pos >= length) {
			pos = length - 1;
		}
		if (pos == 0) {
			head = head.getNext();
		} else {
			ListNode currentNode = head;
			for (int i = 1; i < pos; i++) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(currentNode.getNext().getNext());
		}
		length--;

	}

	// remove matched node in LL
	public void removeMatchedNode(ListNode node) {

		if (node.equals(head)) {
			head = head.getNext();
			return;
		}
		ListNode currentNode = head.getNext();
		ListNode tmp = head;
		while (currentNode != null) {
			if (node.equals(currentNode)) {
				tmp.setNext(currentNode.getNext());
				return;
			}
			tmp = currentNode;
			currentNode = currentNode.getNext();
		}
	}

	public static void main(String args[]) {

		SinglyLinkedList LL = new SinglyLinkedList();
		LL.insertNodeAtHead(new ListNode(1));
		LL.insertNodeAtEnd(new ListNode(2));
		// LL.removeDataAtHead();
		// LL.removeNodeAtEnd();
		LL.insertNodeAtPosition(1, new ListNode(3));
		// LL.removeNodeAtGivenPosition(2);

		// traversing the linked list data
		ListNode currentNode = LL.head;
		while (currentNode != null) {
			if (currentNode.getData() == 3) {
				LL.removeMatchedNode(currentNode);

			} else {
				System.out.println(currentNode.getData());
			}
			currentNode = currentNode.getNext();
		}
	}

}

class ListNode {

	private int data;
	private ListNode next;

	ListNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
}
