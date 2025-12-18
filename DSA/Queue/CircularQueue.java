class CircularQueue {
    int[] q;
    int front = -1, rear = -1, size;

    CircularQueue(int size) {
        this.size = size;
        q = new int[size];
    }

    void enqueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Full");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        q[rear] = x;
    }

    int dequeue() {
        if (front == -1) return -1;
        int val = q[front];
        if (front == rear) front = rear = -1;
        else front = (front + 1) % size;
        return val;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        cq.enqueue(10);
        cq.enqueue(20);
        System.out.println(cq.dequeue());
    }
}
