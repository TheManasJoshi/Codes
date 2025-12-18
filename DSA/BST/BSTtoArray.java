import java.util.*;

class BSTtoArray {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static void inorder(Node root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        System.out.println(list);
    }
}
