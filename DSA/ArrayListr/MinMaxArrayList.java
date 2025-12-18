import java.util.*;

class MinMaxArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
