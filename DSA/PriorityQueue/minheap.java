import java.util.*;

class minheap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) pq.add(sc.nextInt());

        System.out.println("Min Heap order:");
        while (!pq.isEmpty()) System.out.print(pq.poll() + " ");
    }
}
