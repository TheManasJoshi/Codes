import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        int[] freq = new int[26];

        for (char c : s1.toCharArray())
            freq[c - 'a']++;

        for (char c : s2.toCharArray())
            freq[c - 'a']--;

        for (int x : freq) {
            if (x != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
