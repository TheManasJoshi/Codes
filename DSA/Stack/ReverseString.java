import java.util.Stack;

class ReverseString {
    public static void main(String[] args) {
        String str = "JAVA";
        Stack<Character> st = new Stack<>();

        for (char c : str.toCharArray())
            st.push(c);

        String reversed = "";
        while (!st.isEmpty())
            reversed += st.pop();

        System.out.println(reversed);
    }
}
