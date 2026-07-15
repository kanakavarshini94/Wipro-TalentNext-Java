import java.util.Properties;
import java.util.Iterator;
import java.util.Map;

public class Assignment3 {
    public static void main(String[] args) {

        // Create Properties object
        Properties p = new Properties();

        // Add States and Capitals
        p.setProperty("Andhra Pradesh", "Amaravati");
        p.setProperty("Telangana", "Hyderabad");
        p.setProperty("Karnataka", "Bengaluru");
        p.setProperty("Tamil Nadu", "Chennai");
        p.setProperty("Maharashtra", "Mumbai");

        // Iterate using Iterator
        Iterator<Map.Entry<Object, Object>> it = p.entrySet().iterator();

        System.out.println("States and their Capitals:");

        while (it.hasNext()) {
            Map.Entry<Object, Object> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}