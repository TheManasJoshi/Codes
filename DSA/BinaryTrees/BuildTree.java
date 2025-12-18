import java.util.*;

class BuildTree {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static Node build(Scanner sc) {
        int val = sc.nextInt();
        if (val == -1) return null;

        Node root = new Node(val);
        root.left = build(sc);
        root.right = build(sc);
        return root;
    }

    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = build(sc);   // use -1 for null
        inorder(root);
    }
}
