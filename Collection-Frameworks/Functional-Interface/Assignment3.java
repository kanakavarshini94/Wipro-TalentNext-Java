import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment3 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("java");
        words.add("level");
        words.add("hello");
        words.add("radar");
        words.add("world");
        words.add("malayalam");
        words.add("apple");
        words.add("noon");
        words.add("wipro");

        Predicate<String> isPalindrome = word -> {
            String reverse = new StringBuilder(word).reverse().toString();
            return word.equalsIgnoreCase(reverse);
        };

        System.out.println("Palindrome Words:");

        for (String word : words) {
            if (isPalindrome.test(word)) {
                System.out.println(word);
            }
        }
    }
}