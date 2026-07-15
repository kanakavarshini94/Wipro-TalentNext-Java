import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment2 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", 25, "Pune"));
        employees.add(new Employee(102, "Anjali", 23, "Hyderabad"));
        employees.add(new Employee(103, "Kiran", 28, "Pune"));
        employees.add(new Employee(104, "Sneha", 24, "Chennai"));
        employees.add(new Employee(105, "Ravi", 27, "Pune"));

        // Filter employees whose location is Pune
        List<Employee> puneEmployees = employees.stream()
                .filter(emp -> emp.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees from Pune:");

        puneEmployees.forEach(System.out::println);
    }
}