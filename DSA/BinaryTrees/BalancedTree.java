class BalancedTree {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static int check(Node root) {
        if (root == null) return 0;
        int l = check(root.left);
        if (l == -1) return -1;
        int r = check(root.right);
        if (r == -1) return -1;
        if (Math.abs(l - r) > 1) return -1;
        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);

        System.out.println(check(root) != -1);
    }
}
