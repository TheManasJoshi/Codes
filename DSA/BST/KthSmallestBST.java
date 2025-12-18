import java.util.*;

class KthSmallestBST {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static int count = 0;
    static int result = -1;

    static void kthSmallest(Node root, int k) {
        if (root == null) return;

        kthSmallest(root.left, k);

        count++;
        if (count == k) { result = root.data; return; }

        kthSmallest(root.right, k);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        int k = 3;
        kthSmallest(root, k);
        System.out.println(result);
    }
}
