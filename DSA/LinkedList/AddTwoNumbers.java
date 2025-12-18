import java.util.Scanner;

class AddTwoNumbers {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node add(Node a, Node b) {
        Node dummy = new Node(0), tail = dummy;
        int carry = 0;

        while (a != null || b != null || carry != 0) {
            int sum = carry;
            if (a != null) { sum += a.data; a = a.next; }
            if (b != null) { sum += b.data; b = b.next; }

            tail.next = new Node(sum % 10);
            carry = sum / 10;
            tail = tail.next;
        }
        return dummy.next;
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

    static void print(Node h) {
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node l1 = build(sc, sc.nextInt());
        Node l2 = build(sc, sc.nextInt());

        print(add(l1, l2));
    }
}
