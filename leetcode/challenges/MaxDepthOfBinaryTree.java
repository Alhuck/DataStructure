package diy.learnings.leetcode.challenges;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }

    TreeNode(int data) {
        this.val = data;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.val = data;
        this.left = left;
        this.right = right;
    }
}

public class MaxDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {

        // optimized approach using recursion strategy
        // if (root == null) {
        // return 0;
        // } else {
        // // Math.max returns highest value between given two values
        // return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        // }

        // bruteforce approach;

        if (root == null)
            return 0;

        Stack<Integer> depthStack = new Stack<>();
        Stack<TreeNode> stack = new Stack<>();
        int max = 1;
        stack.push(root);
        depthStack.push(1);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            Integer depth = depthStack.pop();

            if (current.left == null && current.right == null) {
                max = Integer.max(max, depth);
            }
            if (current.left != null) {
                stack.add(current.left);
                depthStack.add(depth + 1);
            }

            if (current.right != null) {
                stack.add(current.right);
                depthStack.add(depth + 1);
            }

        }

        return max;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        // root.right.right.right = new TreeNode(29);

        System.out.println(maxDepth(root));

        // System.out.println(Math.max(1, 2));

    }

}
