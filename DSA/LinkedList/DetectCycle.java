import java.util.*;

class DetectCycle {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2); // simulated loop data

        for (int x : list) {
            if (set.contains(x)) {
                System.out.println("Cycle detected");
                return;
            }
            set.add(x);
        }
        System.out.println("No cycle");
    }
}
