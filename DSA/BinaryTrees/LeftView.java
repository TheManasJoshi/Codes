
class LeftView {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static int maxLevel = 0;

    static void leftView(Node root, int level) {
        if (root == null) return;

        if (level > maxLevel) {
            System.out.print(root.data + " ");
            maxLevel = level;
        }

        leftView(root.left, level + 1);
        leftView(root.right, level + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);

        leftView(root, 1);
    }
}
