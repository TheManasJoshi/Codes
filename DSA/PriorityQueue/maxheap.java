import java.util.*;

class maxheap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) pq.add(sc.nextInt());

        System.out.println("Max Heap order:");
        while (!pq.isEmpty()) System.out.print(pq.poll() + " ");
    }
}
