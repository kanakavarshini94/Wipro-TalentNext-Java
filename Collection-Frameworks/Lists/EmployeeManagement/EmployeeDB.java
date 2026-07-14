import java.util.ArrayList;

public class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<>();


    // Add employee
    public boolean addEmployee(Employee e) {

        return list.add(e);
    }


    // Delete employee using empId
    public boolean deleteEmployee(int empId) {

        for(Employee e : list) {

            if(e.empId == empId) {

                list.remove(e);
                return true;
            }
        }

        return false;
    }


    // Display payslip
    public String showPaySlip(int empId) {

        for(Employee e : list) {

            if(e.empId == empId) {

                return "Employee ID : " + e.empId +
                       "\nEmployee Name : " + e.empName +
                       "\nSalary : " + e.salary;
            }
        }

        return "Employee Not Found";
    }


    // Display all employees
    public void displayEmployees() {

        for(Employee e : list) {

            e.GetEmployeeDetails();
        }
    }
}