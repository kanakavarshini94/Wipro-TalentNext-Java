import java.util.TreeSet;
import java.util.Iterator;

public class Assignment3 {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<String>();

        // Adding elements
        ts.add("India");
        ts.add("USA");
        ts.add("Japan");
        ts.add("Australia");
        ts.add("Canada");

        // a) Reverse the elements
        System.out.println("Reverse Order:");
        System.out.println(ts.descendingSet());

        // b) Iterate using Iterator
        System.out.println("\nElements using Iterator:");
        Iterator<String> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // c) Check if an element exists
        String search = "India";
        if (ts.contains(search)) {
            System.out.println("\n" + search + " exists in the TreeSet.");
        } else {
            System.out.println("\n" + search + " does not exist in the TreeSet.");
        }
    }
}