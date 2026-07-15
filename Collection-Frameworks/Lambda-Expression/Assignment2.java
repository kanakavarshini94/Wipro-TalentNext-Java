import java.util.ArrayList;
import java.util.Collections;

public class Assignment2 {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();

        // Add 10 different words
        a1.add("Apple");
        a1.add("Banana");
        a1.add("Orange");
        a1.add("Mango");
        a1.add("Grapes");
        a1.add("Cherry");
        a1.add("Pineapple");
        a1.add("Papaya");
        a1.add("Guava");
        a1.add("Kiwi");

        System.out.println("Original List:");
        a1.forEach(word -> System.out.print(word + " "));

        // Reverse the list
        Collections.reverse(a1);

        System.out.println("\n\nStrings in Reverse Order:");
        a1.forEach(word -> System.out.print(word + " "));
    }
}