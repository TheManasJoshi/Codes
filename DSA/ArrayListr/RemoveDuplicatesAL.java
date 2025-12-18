import java.util.*;

class RemoveDuplicatesAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        set.addAll(list);
        list.clear();
        list.addAll(set);

        System.out.println(list);
    }
}
