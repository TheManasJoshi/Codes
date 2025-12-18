class SymmetricTree {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static boolean isMirror(Node a, Node b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.data == b.data &&
               isMirror(a.left, b.right) &&
               isMirror(a.right, b.left);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.right.right = new Node(3);

        System.out.println(isMirror(root.left, root.right));
    }
}
