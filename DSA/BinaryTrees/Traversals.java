class Traversals {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static void preorder(Node r) {
        if (r == null) return;
        System.out.print(r.data + " ");
        preorder(r.left);
        preorder(r.right);
    }

    static void inorder(Node r) {
        if (r == null) return;
        inorder(r.left);
        System.out.print(r.data + " ");
        inorder(r.right);
    }

    static void postorder(Node r) {
        if (r == null) return;
        postorder(r.left);
        postorder(r.right);
        System.out.print(r.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        preorder(root);
        inorder(root);
        postorder(root);
    }
}
