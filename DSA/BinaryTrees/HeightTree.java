class HeightTree {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        System.out.println(height(root));
    }
}
