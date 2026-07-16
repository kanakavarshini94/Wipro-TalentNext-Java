import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", 8000));
        employees.add(new Employee(102, "Priya", 15000));
        employees.add(new Employee(103, "Amit", 9500));
        employees.add(new Employee(104, "Sneha", 12000));
        employees.add(new Employee(105, "Kiran", 7000));

        Predicate<Employee> salaryLessThan10000 =
                emp -> emp.getSalary() < 10000;

        System.out.println("Employees with Salary less than 10000:");

        for (Employee emp : employees) {
            if (salaryLessThan10000.test(emp)) {
                System.out.println(emp.getName());
            }
        }
    }
}