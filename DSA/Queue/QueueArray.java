class QueueArray {
    int front = 0, rear = -1, size;
    int[] queue;

    QueueArray(int size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = x;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue());
    }
}
