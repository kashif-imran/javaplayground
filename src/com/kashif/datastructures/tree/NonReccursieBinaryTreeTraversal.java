package com.kashif.datastructures.tree;

import java.util.Stack;

/*https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/

1) Create an empty stack S.
2) Initialize current node as root
3) Push the current node to S and set current = current->left until current is NULL
4) If current is NULL and stack is not empty then 
     a) Pop the top item from stack.
     b) Print the popped item, set current = popped_item->right 
     c) Go to step 3.
5) If current is NULL and stack is empty then we are done.

*/

/* Class containing left and right child of 
current node and key value*/

public class NonReccursieBinaryTreeTraversal {
	
	public static void main(String args[]) {

		/*
		 * creating a binary tree and entering the nodes
		 */
		BinaryTree tree = new NonReccursieBinaryTreeTraversal().new BinaryTree();
		tree.root =  new NonReccursieBinaryTreeTraversal().new Node(1);
		tree.root.left =  new NonReccursieBinaryTreeTraversal().new Node(2);
		tree.root.right =  new NonReccursieBinaryTreeTraversal().new Node(3);
		tree.root.left.left =  new NonReccursieBinaryTreeTraversal().new Node(4);
		tree.root.left.right =  new NonReccursieBinaryTreeTraversal().new Node(5);
		tree.inorder();
	}
	
	class  Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
		
		@Override
		public String toString() {
			return String.valueOf(data);
		}
	}

	/* Class to print the inorder traversal */
	class BinaryTree {
		Node root;

		void inorder() {
			if (root == null) {
				return;
			}

			Stack<Node> s = new Stack<Node>();
			Node curr = root;

			// traverse the tree
			while (curr != null || s.size() > 0) {

				/*
				 * Reach the left most Node of the curr Node
				 */
				while (curr != null) {
					/*
					 * place pointer to a tree node on the stack before
					 * traversing the node's left subtree
					 */
					s.push(curr);
					curr = curr.left;
				}

				/* Current must be NULL at this point */
				curr = s.pop();

				System.out.print(curr.data + " ");

				/*
				 * we have visited the node and its left subtree. Now, it's
				 * right subtree's turn
				 */
				curr = curr.right;
			}
		}

	}

}
