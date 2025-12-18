class LCA {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static Node lca(Node root, int a, int b) {
        if (root == null) return null;

        if (root.data > a && root.data > b) return lca(root.left, a, b);
        if (root.data < a && root.data < b) return lca(root.right, a, b);
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);

        System.out.println(lca(root, 5, 15).data);
    }
}
