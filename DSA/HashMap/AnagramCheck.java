
import java.util.*;

class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) {
                System.out.println(false);
                return;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0)
                map.remove(c);
        }

        System.out.println(map.isEmpty());
    }
}
