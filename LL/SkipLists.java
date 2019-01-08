package diy.learnings.LL;

import java.util.Random;

public class SkipLists {

	Node head;
	int size;
	/*
	 * need to find its exact use case as of now used to randomly generate levels
	 * for node
	 */
	Random random;
	double p;

	SkipLists() {
		head = new Node(null, null, 0, null, null);
		size = 0;
		random = new Random(); // ?check why
		p = 0.5; // ?check why
	}

	/*
	 * generate random level value for a node based on list size
	 */
	public long getRandomLevel() {
		long level = 0;
		while (level <= size && random.nextDouble() < p) {
			level++;
		}
		return level;
	}

	/*
	 * method to add a node in skip lists
	 */
	public void addNewNode(int key, int value) {

		long randomLevel = getRandomLevel();
		if (randomLevel > head.level) {
			head = new Node(null, null, randomLevel, null, head);
		}
		Node current = head;
		Node last = null;
		while (current != null) {

			if (current.next == null || current.next.key.compareTo(key) > 0) {

				if (randomLevel >= current.level) {
					Node newNode = new Node(key, value, current.level, current.next, null);
					if (last != null) {
						last.down = newNode;
					}
					current.next = newNode;
					last = newNode;
				}
				current = current.down;
				continue;
			} else if (current.next.key.equals(key)) {
				current.next.value = value;
				break;
			}
			current = current.next;

		}
		size++;
	}

	/*
	 * method to remove a node from a skip lists
	 */
	public void removeNode(int key) {

		Node current = head;
		while (current != null) {

			if (current.next == null || current.next.key.compareTo(key) >= 0) {
				if (current.next != null && current.next.key.equals(key)) {
					current.next = current.next.next;
				}
				current = current.down;
				continue;
			}
			current = current.next;
		}
		size--;
	}

	/*
	 * search the list for given key and return its value
	 */
	public Integer getValue(int key) {

		Node current = head;
		while (current != null) {
			/*
			 * search will go on a express lane, if key value less the express lanes next
			 * key value, then search will be redirected to current express lanes, child
			 * lanes
			 */
			if (current.next == null || current.next.key.compareTo(key) > 0) {
				current = current.down;
				continue;
			} else if (current.next.key.equals(key)) {
				return current.next.value;
			}
			current = current.next;
		}
		return null;
	}

	public static void main(String[] args) {

		SkipLists sk = new SkipLists();
		sk.addNewNode(2, 20);
		sk.addNewNode(3, 30);
		sk.addNewNode(4, 40);
		sk.addNewNode(5, 50);
		sk.removeNode(4);
		System.out.println(sk.getValue(4));
		System.out.println(sk.getValue(3));
	}

}

class Node {
	Integer key;
	Integer value;
	long level;
	Node next;
	Node down;

	Node(Integer key, Integer value, long level, Node next, Node down) {
		this.key = key;
		this.value = value;
		this.level = level;
		this.next = next;
		this.down = down;
	}
}