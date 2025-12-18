import java.util.Scanner;

class LL {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node head;

    static void add(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
            return;
        }
        Node t = head;
        while (t.next != null)
            t = t.next;
        t.next = n;
    }

    static void show() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0)
            add(sc.nextInt());
        show();
    }
}
