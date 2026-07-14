import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayListIterator {

    // Method to print all elements using Iterator
    public static void printAll(ArrayList<String> list) {

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }


    public static void main(String[] args) {

        // Create ArrayList that stores only Strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Java");
        names.add("Python");
        names.add("C");
        names.add("JavaScript");
        names.add("SQL");


        // Print elements
        System.out.println("Elements in ArrayList:");

        printAll(names);
    }
}