package diy.learnings.tree;

class TreeNode {

	int key;
	TreeNode leftChildNode;
	TreeNode rightChildNode;

	TreeNode(int data) {
		this.key = data;
		this.leftChildNode = null;
		this.rightChildNode = null;
	}
}

class BTree {

	TreeNode root;

	BTree() {
		this.root = null;
	}

	void insertBTree(int data) {

		if (this.root == null) {

			this.root = new TreeNode(data);
			return;
		} else {

			// current node is root node
			TreeNode current = this.root;
			TreeNode parent = null;

			while (true) {

				// parent node will be changed on every iteration
				parent = current;

				// left subtree traversal and insertion of data
				if (data <= parent.key) {
					current = current.leftChildNode;

					if (current == null) {
						parent.leftChildNode = new TreeNode(data);
						return;
					}

				} else { // right subtree traversal and insertion of data
					current = parent.rightChildNode;

					if (current == null) {
						parent.rightChildNode = new TreeNode(data);
						return;
					}
				}

			}

		}
	}

	Integer searchBTree(int searchData) {

		if (this.root.key == searchData) {
			return this.root.key;
		} else {

			boolean dataFound = false;
			TreeNode current = this.root;
			TreeNode parent = null;
			while (!dataFound) {
				parent = current;
				// traversing left subtree for searching the data
				if (searchData < parent.key) {
					current = parent.leftChildNode;
				} else { // traversing right subtree for searching the data
					current = parent.rightChildNode;
				}
				if (current == null) {
					return null;
				}
				if (current.key == searchData) {
					dataFound = true;
					return current.key;
				}

			}
		}

		return null;
	}
}

public class BinaryTreeSearchNInsertion {

	public static void main(String[] args) {

		BTree bTree = new BTree();
		bTree.insertBTree(1);
		bTree.insertBTree(5);
		bTree.insertBTree(3);
		bTree.insertBTree(2);
		/*
		 	1
		   / \
		      5
		     / \
		    3
		   / \
		  2 
	   */

		if (bTree.searchBTree(2) == null) {
			System.out.println("Data not found");
		} else {
			System.out.println("Data found");
		}

	}
}
