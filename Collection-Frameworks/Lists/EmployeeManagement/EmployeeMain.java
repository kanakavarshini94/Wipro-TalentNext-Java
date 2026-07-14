public class EmployeeMain {

    public static void main(String[] args) {


        EmployeeDB db = new EmployeeDB();


        Employee e1 = new Employee(
                101,
                "Varshini",
                "varshini@gmail.com",
                "Female",
                50000
        );


        Employee e2 = new Employee(
                102,
                "Sudhir",
                "sudhir@gmail.com",
                "Male",
                60000
        );


        Employee e3 = new Employee(
                103,
                "Selvan",
                "selvan@gmail.com",
                "Male",
                70000
        );


        // Adding employees
        System.out.println("Adding Employees:");

        System.out.println(db.addEmployee(e1));
        System.out.println(db.addEmployee(e2));
        System.out.println(db.addEmployee(e3));


        System.out.println("\nEmployee Details:");

        db.displayEmployees();


        // Payslip
        System.out.println("\nPayslip:");

        System.out.println(db.showPaySlip(102));


        // Delete employee
        System.out.println("\nDeleting Employee ID 103:");

        System.out.println(db.deleteEmployee(103));


        System.out.println("\nAfter Delete:");

        db.displayEmployees();

    }
}