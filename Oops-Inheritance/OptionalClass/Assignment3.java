import java.util.Optional;

class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }
}


public class Assignment3 {

    public static void main(String[] args) {

        Employee emp = null;


        try {

            Optional<Employee> employee =
                    Optional.ofNullable(emp);


            employee.orElseThrow(() ->
                    new InvalidEmployeeException("Employee not found"));


            System.out.println("Employee exists");

        }

        catch(InvalidEmployeeException e) {

            System.out.println(e.getMessage());
        }
    }
}