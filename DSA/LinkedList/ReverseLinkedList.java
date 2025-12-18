import java.util.*;

class TwoSumArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        int target = sc.nextInt();

        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        Collections.sort(list);

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == target) {
                System.out.println(list.get(left) + " " + list.get(right));
                return;
            }
            if (sum < target) left++;
            else right--;
        }
        System.out.println("No pair found");
    }
}
