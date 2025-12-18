import java.util.Stack;

class MinStack {
    Stack<Integer> st = new Stack<>();
    int min;

    void push(int x) {
        if (st.isEmpty()) {
            st.push(x);
            min = x;
        } else if (x < min) {
            st.push(2 * x - min);
            min = x;
        } else {
            st.push(x);
        }
    }

    int pop() {
        if (st.isEmpty()) return -1;
        int top = st.pop();
        if (top < min) {
            int prevMin = min;
            min = 2 * min - top;
            return prevMin;
        }
        return top;
    }

    int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(5);
        ms.push(2);
        ms.push(8);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
    }
}
