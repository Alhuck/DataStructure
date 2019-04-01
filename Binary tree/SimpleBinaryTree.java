package diy.learnings.tree;

class Node {

	int key;
	Node leftNode;
	Node rightNode;

	Node(int data) {
		this.key = data;
		this.leftNode = null;
		this.rightNode = null;
	}
}

class BinaryTree {

	Node root;

	BinaryTree() {
		this.root = null;
	}

	BinaryTree(int data) {
		this.root = new Node(data);
	}
}

public class SimpleBinaryTree {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.leftNode = new Node(2);
		tree.root.rightNode = new Node(3);
		tree.root.leftNode.leftNode = new Node(4);
		tree.root.leftNode.rightNode = new Node(8);
		tree.root.rightNode.rightNode = new Node(5);
		tree.root.rightNode.leftNode = new Node(10);
		tree.root.rightNode.rightNode.rightNode = new Node(6);
		/* tree representation of binary tree created above
				    1 
		         /     \ 
		        2       3
		       / \     / \
		      4   8   10   5  
		                    \
		                     6
        */
		
	}

}
