import java.util.Scanner;

class MaxSumSubarrayK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += arr[i];

        int maxSum = sum;

        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}
