import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<>();

        System.out.println("Enter the Number of Employees");

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter Employee " + i + " Details");

            System.out.println("Enter the Firstname");
            String first = sc.nextLine();

            System.out.println("Enter the Lastname");
            String last = sc.nextLine();

            System.out.println("Enter the Mobile");
            long mobile = Long.parseLong(sc.nextLine());

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            Employee emp = new Employee(first, last, mobile, email, address);

            list.add(emp);
        }

        Collections.sort(list);

        System.out.println();

        System.out.printf("%-15s %-15s %-15s %-30s %-15s\n",
                "Firstname",
                "Lastname",
                "Mobile",
                "Email",
                "Address");

        for (Employee e : list) {

            System.out.printf("%-15s %-15s %-15d %-30s %-15s\n",
                    e.getFirstName(),
                    e.getLastName(),
                    e.getMobile(),
                    e.getEmail(),
                    e.getAddress());
        }

        sc.close();
    }
}