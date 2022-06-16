public class proTree {
    
}
// ini isinya class node

/* Class node berisi kiri dan kanan cabang pada node saat ini dan key value*/
class Node {
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

class BinaryTree {
	// Root of Binary Tree
	Node root;

	BinaryTree() { root = null; }

	/* ini buat postorder */
	void printPostorder(Node node)
	{
		if (node == null)
			return;

		// pertama ambil node yang dikiri
		printPostorder(node.left);

		// selanjutnya ambil node yang dikanan
		printPostorder(node.right);

		// lalu cetak node nya
		System.out.print(node.key + " ");
	}

	/*inorder binarytree*/
	void printInorder(Node node)
	{
		if (node == null)
			return;

		/* cari cabang yang paling kanan*/
		printInorder(node.left);

		/* lalu cetak data node nya */
		System.out.print(node.key + " ");

		/* lalu cari cabang yang ada di sebelah kanannya */
		printInorder(node.right);
	}

	/* binary tree untuk cetak node pada preorder*/
	void printPreorder(Node node)
	{
		if (node == null)
			return;

		/* cetak nilai pertama */
		System.out.print(node.key + " ");

		/* rekursif ke cabang kiri */
		printPreorder(node.left);

		/* rekursif untuk node kanan */
		printPreorder(node.right);
	}

	// menggunakan fungsi rekursif untuk menjalankan perintah
	void printPostorder() { printPostorder(root); }
	void printInorder() { printInorder(root); }
	void printPreorder() { printPreorder(root); }

	// Driver method
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(5);
		tree.root.left = new Node(3);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(4);
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(11);



		System.out.println(
			"Preorder dari binary tree adalah ");
		tree.printPreorder();

		System.out.println(
			"\nInorder dari binary tree adalah ");
		tree.printInorder();

		System.out.println(
			"\nPostorder dari binary tree adalah ");
		tree.printPostorder();
	}
}

