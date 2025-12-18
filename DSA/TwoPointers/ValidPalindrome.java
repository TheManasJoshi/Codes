import java.util.Scanner;

class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            else if (!Character.isLetterOrDigit(s.charAt(right)))
                right--;
            else if (s.charAt(left) != s.charAt(right)) {
                System.out.println(false);
                return;
            } else {
                left++;
                right--;
            }
        }

        System.out.println(true);
    }
}
