public class ReverseWords {
    public static void main(String[] args) {
        String s = "HEllo THis IS Manas";
        String[] words = s.split(" ");

        int l = 0, r = words.length - 1;
        while (l < r) {
            String temp = words[l];
            words[l] = words[r];
            words[r] = temp;
            l++; r--;
        }

        String result = String.join(" ", words);
        System.out.println(result);
    }
}
