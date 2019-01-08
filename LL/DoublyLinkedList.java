package diy.learnings.LL;

public class DoublyLinkedList {

	DLLNode head;
	DLLNode tail;
	int length;

	public DoublyLinkedList() {

		head = new DLLNode(1, null, null);
		tail = new DLLNode(5, head, null);
		head.setNext(tail);
		length = 0;
	}

	// insert node at head
	public void insertNodeAtHead(DLLNode node) {

		if (head != null) {
			node.setNext(head.getNext());
			node.getNext().setPrev(node);
			head = node;
			length++;
		}
	}

	// insert data at a given position
	public void insertDataAtGivenPosition(int data, int pos) {

		if (pos < 0) {
			pos = 0;
		}
		if (pos > length) {
			pos = length;
		}
		if (pos == 0) {
			DLLNode newNode = new DLLNode(data, null, head);
			head.setPrev(newNode);
			head = newNode;
		} else {
			DLLNode tmp = head;
			for (int i = 1; i < pos; i++) {
				tmp = tmp.getNext();
			}
			DLLNode newNode = new DLLNode(data, tmp, tmp.getNext());
			newNode.getNext().setPrev(newNode);
			tmp.setNext(newNode);
		}
		length++;
	}

	// insert data at tail
	public void insertNodeAtTail(DLLNode node) {

		node.setNext(tail);
		node.setPrev(tail.getPrev());

		node.getPrev().setNext(node);
		tail.setPrev(node);
		length++;
	}

	// remove node at a given position
	public void removeNodeAtGivenPos(int pos) {

		if (pos < 0) {
			pos = 0;
		}
		if (pos > length) {
			pos = length;
		}
		if (pos == 0) {
			removeNodeAtHead();
		} else {
			DLLNode tmp = head.getNext();
			for (int i = 1; i < pos; i++) {
				tmp = tmp.getNext();
			}
			if (tmp.getNext() != null) {
				tmp.getNext().setPrev(tmp.getPrev());
			}
			tmp.getPrev().setNext(tmp.getNext());
		}
		length--;
	}

	// remove node at head
	public void removeNodeAtHead() {
		head = head.getNext();
		head.setPrev(null);
		length--;
	}

	// remove node at tail
	public void removeNodeAtTail() {
		DLLNode delNode = tail.getPrev();
		tail.setPrev(delNode.getPrev());
		delNode.getPrev().setNext(tail);
		length--;
	}

	// remove matched node
	public void removeAtMatchedNode(DLLNode node) {
		if (head == null) {
			return;
		}
		if (head.equals(node)) {
			head = head.getNext();
			if (head == null) {
				tail = null;
				return;
			}
		}
		DLLNode tmp = head;
		while (tmp != null) {
			if (tmp.equals(node)) {
				if (tmp.getNext() != null) {
					tmp.getNext().setPrev(tmp.getPrev());
				}
				tmp.getPrev().setNext(tmp.getNext());
				return;
			}
			tmp = tmp.getNext();
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();

		DLLNode nodeHead = new DLLNode(2);
		DLLNode nodeTail = new DLLNode(4);
		dll.insertNodeAtHead(nodeHead);
		dll.insertNodeAtTail(nodeTail);
		dll.insertDataAtGivenPosition(3, 1);

		// execute and check the remove nodes todos
		dll.removeNodeAtGivenPos(3);
		dll.removeNodeAtHead();
		dll.removeNodeAtTail();

		// traversing a doubly linked list
		DLLNode currentNode = dll.head;
		while (currentNode != null) {
			if (currentNode.getData() == 3) {
				dll.removeAtMatchedNode(currentNode);
			} else {
				System.out.println(currentNode.getData());
			}
			currentNode = currentNode.getNext();
		}
	}
}

class DLLNode {
	private int data;
	private DLLNode prev;
	private DLLNode next;

	DLLNode(int data) {
		this.setData(data);
		this.setPrev(null);
		this.setNext(null);
	}

	DLLNode(int data, DLLNode prev, DLLNode next) {
		this.setData(data);
		this.setPrev(prev);
		this.setNext(next);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DLLNode getPrev() {
		return prev;
	}

	public void setPrev(DLLNode prev) {
		this.prev = prev;
	}

	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}
}
