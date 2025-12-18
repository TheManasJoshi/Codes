import java.util.Scanner;

class MergeSortedLists {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node build(Scanner sc, int n) {
        Node head = null, tail = null;
        for (int i = 0; i < n; i++) {
            Node node = new Node(sc.nextInt());
            if (head == null) head = tail = node;
            else { tail.next = node; tail = node; }
        }
        return head;
    }

    static Node merge(Node a, Node b) {
        Node dummy = new Node(-1), tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        tail.next = (a != null) ? a : b;
        return dummy.next;
    }

    static void print(Node h) {
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        Node l1 = build(sc, n1);

        int n2 = sc.nextInt();
        Node l2 = build(sc, n2);

        Node res = merge(l1, l2);
        print(res);
    }
}
