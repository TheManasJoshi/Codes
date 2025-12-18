import java.util.Scanner;

class Palindrome {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node head;

    static void add(int x) {
        Node node = new Node(x);
        node.next = head;
        head = node;
    }

    static boolean isPalindrome() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;

        while (temp != null) {
            sb.append(temp.data);
            temp = temp.next;
        }

        return sb.toString().equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            add(sc.nextInt());

        System.out.println(isPalindrome());
    }
}
