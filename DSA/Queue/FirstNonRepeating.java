import java.util.*;

class FirstNonRepeating {
    public static void main(String[] args) {
        String stream = "aabc";
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (char c : stream.toCharArray()) {
            freq[c - 'a']++;
            q.add(c);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1)
                q.poll();

            System.out.print(q.isEmpty() ? "-1 " : q.peek() + " ");
        }
    }
}
