package leet.code;

class Node {
	Node left, right;
	int data;

	Node(int d) {
		data = d;
		left = right = null;
	}
}

public class BinarySearchTree {
	static Node root;

	BinarySearchTree() {
		root = null;
	}

	void insert(int item) {

		root = insertRec(root, item);
	}

	Node insertRec(Node root, int item) {

		if (root == null) {
			root = new Node(item);
			return root;
		}

		if (item > root.data) {
			root.right = insertRec(root.right, item);
		}
		if (item < root.data) {
			root.left = insertRec(root.left, item);
		}
		return root;
	}

	void inorder(Node node) {

		if (node != null) {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}

	Node searchNode(Node root, int item) {

		if (root == null || root.data == item) {
			return root;
		}

		if (item > root.data) {
			return searchNode(root.right, item);
		}

		return searchNode(root.left, item);

	}

	void deleteKey(int key) {
		root = deleteRec(root, key);
	}

	/* A recursive function to insert a new key in BST */
	Node deleteRec(Node root, int key) {
		/* Base Case: If the tree is empty */
		if (root == null)
			return root;

		/* Otherwise, recur down the tree */
		if (key < root.data)
			root.left = deleteRec(root.left, key);
		else if (key > root.data)
			root.right = deleteRec(root.right, key);

		// if key is same as root's key, then This is the node
		// to be deleted
		else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			root.data = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteRec(root.right, root.data);
		}

		return root;
	}

	int minValue(Node root) {
		int minv = root.data;
		while (root.left != null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.inorder(root);
		Node nn = tree.searchNode(root, 20);

		System.out.println(nn.data);
		
		
		
		System.out.println("\nDelete 20"); 
        tree.deleteKey(20); 
        System.out.println("Inorder traversal of the modified tree"); 
        tree.inorder(root);

	}

}
