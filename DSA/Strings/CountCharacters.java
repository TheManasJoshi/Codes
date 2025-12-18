public class CountCharacters {
    public static void main(String[] args) {
        String s = "Java 123 World";

        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') spaces++;
            else if (Character.isDigit(c)) digits++;
            else if ("aeiouAEIOU".indexOf(c) != -1) vowels++;
            else if (Character.isLetter(c)) consonants++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
