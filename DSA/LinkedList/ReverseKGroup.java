import java.util.Scanner;

class ReverseKGroup {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node reverseK(Node head, int k) {
        Node curr = head, prev = null, next = null;
        int count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next != null)
            head.next = reverseK(next, k);

        return prev;
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
        Node head = build(sc, sc.nextInt());
        int k = sc.nextInt();
        print(reverseK(head, k));
    }
}
