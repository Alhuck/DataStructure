package LL;

public class CircularLinkedList {

	CLLNode tail;
	int length;

	public CircularLinkedList(int data) {

		tail = new CLLNode(data);
		tail.setNext(tail);
		length = 0;
	}

	// insert at head
	public void insertAtHead(int data) {

		CLLNode newNode = new CLLNode(data);
		newNode.setNext(tail.getNext());
		tail.setNext(newNode);
		length++;
	}

	// insert at tail
	public void insertAtTail(int data) {

		CLLNode newNode = new CLLNode(data);
		newNode.setNext(tail.getNext());
		tail.setNext(newNode);
		tail = newNode;
		length++;

	}

	// remove at head
	public void removeAtHead() {
		CLLNode delNode = tail.getNext();
		if (delNode != tail) {
			tail.setNext(delNode.getNext());
			delNode.setNext(null);
			length--;
		} else {
			tail = null;
			length = 0;
		}
	}

	// remove at tail
	public void removeAtTail() {
		// remove at tail points to making a node before tail as new tail and remove the
		// current tail
		CLLNode tmp = tail;
		while (tmp.getNext() != tail) {
			tmp = tmp.getNext();
		}
		if (tmp == tail) {
			tail = null;
			length = 0;
		} else {

			tmp.setNext(tail.getNext());
			tail.setNext(null);
			tail = tmp;
			length--;
		}

	}

	// remove based on given data of node
	public void removeNodeAtMatchingData(int data) {

		if (tail == null) {
			return;
		}

		CLLNode currentNode = tail.getNext();
		CLLNode previousNode = tail;

		while (currentNode != tail) {
			if (currentNode.getData() == data) {
				previousNode.setNext(currentNode.getNext());
				currentNode.setNext(null);
				length--;
				return;
			}
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		if (tail.getData() == data) {
			if (tail == tail.getNext()) {
				tail = null;
				return;
			}
			previousNode.setNext(tail.getNext());
			tail.setNext(null);
			tail = previousNode;
			length--;

		}
	}

	public static void main(String[] args) {

		// todos check all the created methods and also add a remove at given position
		// method

		CircularLinkedList cll = new CircularLinkedList(5);
		cll.insertAtHead(1);
		cll.insertAtTail(6);
		// cll.removeAtHead();
		cll.removeAtTail();

		cll.removeNodeAtMatchingData(1);

		// traversing a circular linked list
		if (cll.tail != null) {

			CLLNode currentNode = cll.tail.getNext();
			while (currentNode != cll.tail) {
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNext();
			}
			System.out.println(cll.tail.getData());
		}
	}

}

class CLLNode {
	private int data;
	private CLLNode next;

	CLLNode(int data) {
		this.setData(data);
	}

	CLLNode(int data, CLLNode next) {
		this.setData(data);
		this.setNext(next);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public CLLNode getNext() {
		return next;
	}

	public void setNext(CLLNode next) {
		this.next = next;
	}

}
