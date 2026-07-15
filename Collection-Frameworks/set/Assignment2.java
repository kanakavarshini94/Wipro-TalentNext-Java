import java.util.HashSet;
import java.util.Iterator;

public class Assignment2 {
    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<String>();

        // Adding employee names
        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Amit");
        employees.add("Sneha");
        employees.add("Kiran");

        // Retrieving elements using Iterator
        Iterator<String> it = employees.iterator();

        System.out.println("Employee Names:");

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}