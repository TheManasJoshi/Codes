import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty())
            st.push(q.poll());

        while (!st.isEmpty())
            q.add(st.pop());

        System.out.println(q);
    }
}
