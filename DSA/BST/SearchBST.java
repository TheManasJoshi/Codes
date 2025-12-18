import java.util.Scanner;

class SearchBST {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node(10);
        root = new BSTInsert().insert(root, 5);
        root = new BSTInsert().insert(root, 15);

        int key = sc.nextInt();
        System.out.println(search(root, key));
    }

    Node insert(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.data) root.left = insert(root.left, key);
        else root.right = insert(root.right, key);
        return root;
    }
}
