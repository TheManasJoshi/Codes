class IntersectionPoint {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node getIntersection(Node a, Node b) {
        Node p1 = a, p2 = b;

        while (p1 != p2) {
            p1 = (p1 == null) ? b : p1.next;
            p2 = (p2 == null) ? a : p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        Node common = new Node(8);
        common.next = new Node(10);

        Node a = new Node(3);
        a.next = new Node(6);
        a.next.next = common;

        Node b = new Node(4);
        b.next = common;

        Node res = getIntersection(a, b);
        System.out.println(res.data);
    }
}
