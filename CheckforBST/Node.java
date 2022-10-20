package BinaryTreeDataStructure.CheckforBST;

public class Node {
    int key;
    Node right;
    Node left;

    public Node(int d) {
        key = d;
        right = null;
        left = null;
    }
}

class Test {
    public static void main(String[] args) {
        Node root = new Node(0);
        root.right = new Node(2);
        root.left = new Node(1);
        root.right.left = new Node(4);
        root.right.right = new Node(6);
        root.left.left = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(5);
        root.right.right.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right.right.right = new Node(10);

        checkforBinaryTree(root);

    }

    public static int checkforBinaryTree(Node root) {
        if (root == null) {
            return -1;
        } else if (root.left == null || root.right == null) {
            return -1;
        } else {
            return 1;
        }
    }
}