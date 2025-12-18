import java.util.*;

class DequeBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();

        // Adding elements at both ends
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);
        dq.addLast(25);

        System.out.println("Deque: " + dq);

        // Removing elements
        System.out.println("Removed First: " + dq.removeFirst());
        System.out.println("Removed Last: " + dq.removeLast());

        // Peek
        System.out.println("Peek First: " + dq.peekFirst());
        System.out.println("Peek Last: " + dq.peekLast());

        System.out.println("Final Deque: " + dq);
    }
}
