class RemoveLoop {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static void removeLoop(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        if (slow != fast) return;

        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b; b.next = c; c.next = d; d.next = b;
        removeLoop(a);
        System.out.println("Loop removed");
    }
}
