import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        // ArrayList that stores only numbers
        ArrayList<Number> numbers = new ArrayList<>();

        // Adding different numeric values
        numbers.add(10);        // Integer
        numbers.add(25.5f);     // Float
        numbers.add(99.99);     // Double
        numbers.add(5000L);     // Long


        // Printing values
        System.out.println("Numbers in ArrayList:");

        for(Number n : numbers) {

            System.out.println(n);
        }
    }
}