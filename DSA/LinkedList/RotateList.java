import java.util.Scanner;

class RotateList {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node rotate(Node head, int k) {
        if (head == null || k == 0) return head;

        Node curr = head;
        int len = 1;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }

        curr.next = head;
        k = k % len;
        for (int i = 0; i < len - k; i++)
            curr = curr.next;

        head = curr.next;
        curr.next = null;
        return head;
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
        print(rotate(head, sc.nextInt()));
    }
}
