import java.util.*;

class BinaryNumbers {
    public static void main(String[] args) {
        int n = 5;
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 1; i <= n; i++) {
            String s = q.poll();
            System.out.print(s + " ");
            q.add(s + "0");
            q.add(s + "1");
        }
    }
}
