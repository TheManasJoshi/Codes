import java.util.*;

class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (map.containsKey(target - x)) {
                System.out.println(map.get(target - x) + " " + i);
                return;
            }
            map.put(x, i);
        }
        System.out.println("No pair");
    }
}
