import java.util.ArrayList;

public class Assignment3 {

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

        System.out.println("Strings with Odd Length:");

        // Print strings whose length is odd using lambda
        a1.forEach(word -> {
            if (word.length() % 2 != 0) {
                System.out.println(word);
            }
        });
    }
}