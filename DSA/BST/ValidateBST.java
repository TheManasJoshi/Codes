class ValidateBST {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static boolean isBST(Node root, Node min, Node max) {
        if (root == null) return true;
        if ((min != null && root.data <= min.data) || (max != null && root.data >= max.data)) return false;
        return isBST(root.left, min, root) && isBST(root.right, root, max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        System.out.println(isBST(root, null, null));
    }
}
