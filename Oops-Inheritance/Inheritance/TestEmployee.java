public class TestEmployee {

    public static void main(String[] args) {


        Employee emp = new Employee(
                "Varshini",
                600000,
                2026,
                "NI12345"
        );


        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());


        // Testing setters

        emp.setAnnualSalary(700000);

        System.out.println("Updated Salary: " + emp.getAnnualSalary());
    }
}