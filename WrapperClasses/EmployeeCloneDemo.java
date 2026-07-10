class Employee implements Cloneable {

    int id;
    String name;
    double salary;


    Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;

    }


    public Object clone() throws CloneNotSupportedException {

        return super.clone();

    }


    void display() {

        System.out.println("Employee Id : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);

    }
}


public class EmployeeCloneDemo {

    public static void main(String[] args) {


        try {

            // Creating original employee object
            Employee emp1 = new Employee(101, "Varshini", 50000);


            // Creating clone object
            Employee emp2 = (Employee) emp1.clone();


            // Changing original object properties
            emp1.name = "Kavya";
            emp1.salary = 60000;


            System.out.println("Original Employee Details:");
            emp1.display();


            System.out.println();


            System.out.println("Clone Employee Details:");
            emp2.display();


        }

        catch(CloneNotSupportedException e) {

            System.out.println(e);

        }

    }
}