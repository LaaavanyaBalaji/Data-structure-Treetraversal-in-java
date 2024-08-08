import java.util.*;
class Node {
    int data;
    Node left, right;
 public Node(int item) {
        data = item;
        left = right = null;
    }
}
   class BinaryTree {
    Node root;
   BinaryTree() {
        root = null;
    }
    void printpostorder(Node node) {
        if (node == null)
            return;
            printpostorder(node.left);
        printpostorder(node.right);
        System.out.print(node.data + " ");
    }
    void printpreorder(Node node) {
        if (node == null)
            return;
            System.out.print(node.data + " ");
           printpreorder(node.left);
        printpreorder(node.right);
}
    void printinorder(Node node) {
        if (node == null)
            return;
            printinorder(node.left);
            System.out.print(node.data + " ");
           printinorder(node.right);
}
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right= new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.left.left.right = new Node(9);
        tree.root.left.left.right.left= new Node(1);
        tree.root.right.left= new Node(7);
        tree.root.right.right= new Node(6);
        tree.root.right.right.left= new Node(8);
     System.out.println("Postorder traversal of binary tree is: ");
        tree.printpostorder(tree.root);
        System.out.print("\n");
        System.out.println("Preorder traversal of binary tree is: ");
        tree.printpreorder(tree.root);
        System.out.println();
        System.out.println("Inorder traversal of binary tree is: ");
        tree.printinorder(tree.root);
        System.out.println();
    }
}

