import java.util.ArrayList;
import java.util.function.Consumer;

public class Assignment6 { 

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Python");
        words.add("Wipro");
        words.add("Oracle");
        words.add("Google");
        words.add("Apple");
        words.add("Microsoft");
        words.add("Amazon");
        words.add("Corizo");
        words.add("IBM");

        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                String reversed = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, reversed);
            }
        };

        reverseWords.accept(words);

        System.out.println("Reversed Words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}