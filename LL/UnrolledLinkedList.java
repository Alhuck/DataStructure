package diy.learnings.LL;

public class UnrolledLinkedList {

	int nodeCapacity;
	ListNode firstNode;
	ListNode lastNode;
	int length;

	public UnrolledLinkedList(int nodeCapacity) {

		if (nodeCapacity < 2) {
			throw new IllegalArgumentException();
		}
		this.nodeCapacity = nodeCapacity;
		this.firstNode = new ListNode();
		this.lastNode = firstNode;
	}

	public UnrolledLinkedList() {
		this(2);
	}

	// insert a element into a node
	public void insertToNode(ListNode node, int position, Object e) {

		if (node.numOfElements == nodeCapacity) {
			// creating a new node and adding half of elements to it
			ListNode newNode = new ListNode();
			int elementsToMove = nodeCapacity / 2;
			int startIndex = nodeCapacity - elementsToMove;

			for (int i = 0; i < elementsToMove; i++) {
				newNode.elements[i] = node.elements[startIndex + i];
				node.elements[startIndex + i] = null;
			}
			node.numOfElements -= elementsToMove;
			newNode.numOfElements = elementsToMove;

			// inserting the node into the list chain
			newNode.next = node.next;
			newNode.prev = node;
			if (node.next != null) {
				node.next.prev = newNode;
			}
			node.next = newNode;

			// identify the position to insert the given element, either in new node or
			// original node
			if (position > node.numOfElements) {
				node = newNode;
				position = position - (node.numOfElements);
			}
		}
		// insert the given element to the identified node
		for (int i = node.numOfElements; i > position; i--) {

			node.elements[i] = node.elements[i - 1];
		}
		node.elements[position] = e;
		node.numOfElements++;
		length++;

	}

	// remove from a element from a node and then shift the values based on node
	// capacity
	public void removeFromNode(ListNode node, int position) {

		node.numOfElements--; // ?why it is decremented, in order to remove the element from the node
		for (int i = position; i < node.numOfElements; i++) {
			// exsisting elements are shifted to delete element from the given position
			node.elements[i] = node.elements[i + 1];
		}
		node.elements[node.numOfElements] = null;
		// since node capacity is reduced for the given node, elements from other node
		// needs to be merged
		if (node.next != null && node.next.numOfElements + node.numOfElements <= nodeCapacity) {
			// ?why this condition is checked first and current node is send, instead of
			// next node
			mergeFromNextNode(node);
		} else if (node.prev != null && node.prev.numOfElements + node.numOfElements <= nodeCapacity) {
			mergeFromNextNode(node.prev);
		}
		length--;
	}

	// merge the given node with the next node
	private void mergeFromNextNode(ListNode node) {

		ListNode next = node.next;
		for (int i = 0; i < next.numOfElements; i++) {
			node.elements[node.numOfElements + 1] = next.elements[i];
			next.elements[i] = null;
		}
		node.numOfElements += next.numOfElements; // ?what will be the num of elements in next node

		// setting the next node and previous node for the merged node
		if (next.next != null) {
			next.next.prev = node;
		}
		node.next = next.next;
		// node.next = next.next.next; ? this is what given as in book but check why
		if (next == lastNode) {
			lastNode = node;
		}

	}

	// add element to a given index alone
	public void add(int index, Object e) {

		// here index is the length of the unrolled linked list
		if (index < 0 || index > length) {
			throw new IndexOutOfBoundsException();
		}
		ListNode node = null;
		int pos = 0;
		if (length - index > index) {
			node = firstNode;
			while (pos <= index - node.numOfElements) {
				pos += node.numOfElements;
				node = node.next;
			}
		} else {
			node = lastNode;
			pos = length;
			while ((pos -= node.numOfElements) > index) {
				node = node.prev;
			}
		}

		insertToNode(node, index - pos, e);
	}

	// remove a element from a given index alone
	public void removeEleFromGivenPos(int pos) {

		if (pos < 0 || pos > length) {
			throw new IndexOutOfBoundsException();
		}
		ListNode node = null;
		int p;
		if (length - pos > pos) {

			node = firstNode;
			p = 0;
			while ((pos - node.numOfElements) <= p) {
				node = node.next;
			}
		} else {
			node = lastNode;
			p = length;
			while ((p += node.numOfElements) < pos) {
				node = node.prev;
			}
		}
		removeFromNode(node, pos - p);
	}

	public static void main(String[] args) {

		UnrolledLinkedList ull = new UnrolledLinkedList();
//		ull.insertToNode(ull.lastNode, ull.lastNode.numOfElements, 45);
//		ull.insertToNode(ull.lastNode, ull.lastNode.numOfElements, 100);
//		ull.insertToNode(ull.lastNode, ull.lastNode.numOfElements, 200);
//		ull.insertToNode(ull.lastNode, ull.lastNode.numOfElements, 300);
//		ull.insertToNode(ull.lastNode, ull.lastNode.numOfElements, 500);
//		ull.insertToNode(ull.lastNode, ull.lastNode.numOfElements, 600);

		ull.add(0, 100);
		ull.add(1, 200);
		ull.add(2, 300);
		ull.add(3, 400);
		ull.add(4, 500);
//		ull.removeFromNode(ull.lastNode, 3);

		// traverse through the elements
		if (ull.firstNode != null) {
			ListNode currentNode = ull.firstNode;
			while (currentNode != null) {
				for (int i = 0; i < currentNode.numOfElements; i++) {
					System.out.println(currentNode.elements[i]);
				}
				currentNode = currentNode.next;
			}
		}
	}

	class ListNode {

		ListNode prev;
		ListNode next;
		int numOfElements;
		Object[] elements;

		ListNode() {
			elements = new Object[nodeCapacity];
		}
	}
}
