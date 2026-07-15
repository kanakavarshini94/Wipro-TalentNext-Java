import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment4 {
    public static void main(String[] args) {

        // Create ContactList using HashMap
        HashMap<String, Integer> contactList = new HashMap<String, Integer>();

        // Add contacts
        contactList.put("Rahul", 987654321);
        contactList.put("Priya", 912345678);
        contactList.put("Amit", 998877665);
        contactList.put("Sneha", 987123456);

        // a) Check if a particular key exists
        String key = "Rahul";
        if (contactList.containsKey(key)) {
            System.out.println(key + " exists in ContactList.");
        } else {
            System.out.println(key + " does not exist in ContactList.");
        }

        // b) Check if a particular value exists
        int value = 998877665;
        if (contactList.containsValue(value)) {
            System.out.println(value + " exists in ContactList.");
        } else {
            System.out.println(value + " does not exist in ContactList.");
        }

        // c) Iterate using Iterator
        System.out.println("\nContact List:");

        Iterator<Map.Entry<String, Integer>> it = contactList.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
