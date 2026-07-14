import java.io.*;
import java.util.Scanner;

class Employee {

    int employeeId;
    String employeeName;
    int employeeAge;
    double salary;

    Employee(int employeeId, String employeeName, int employeeAge, double salary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.salary = salary;
    }


    public String toString() {

        return employeeId + " " + employeeName + " " 
                + employeeAge + " " + salary;
    }
}


public class EmployeeManagementSystem {


    static final String FILE_NAME = "employees.txt";


    public static void addEmployee(Employee emp) {

        try {

            FileWriter fw = new FileWriter(FILE_NAME, true);

            fw.write(emp.toString() + "\n");

            fw.close();

            System.out.println("Employee Added Successfully");

        } 
        catch(IOException e) {

            System.out.println("Error while storing employee details");
        }
    }



    public static void displayEmployees() {

        try {

            FileReader fr = new FileReader(FILE_NAME);

            BufferedReader br = new BufferedReader(fr);


            String line;

            System.out.println("----Report-----");


            while((line = br.readLine()) != null) {

                System.out.println(line);

            }


            System.out.println("----End of Report-----");


            br.close();

        } 
        catch(FileNotFoundException e) {

            System.out.println("No Employee Records Found");

        }
        catch(IOException e) {

            System.out.println("Error reading file");
        }
    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        while(true) {


            System.out.println("Main Menu");

            System.out.println("1. Add an Employee");

            System.out.println("2. Display All");

            System.out.println("3. Exit");


            int choice = sc.nextInt();



            switch(choice) {


                case 1:

                    System.out.print("Enter Employee ID: ");

                    int id = sc.nextInt();


                    System.out.print("Enter Employee Name: ");

                    String name = sc.next();


                    System.out.print("Enter Employee Age: ");

                    int age = sc.nextInt();


                    System.out.print("Enter Employee Salary: ");

                    double salary = sc.nextDouble();



                    Employee emp = new Employee(id, name, age, salary);


                    addEmployee(emp);


                    break;



                case 2:

                    displayEmployees();

                    break;



                case 3:

                    System.out.println("Exiting the System");

                    sc.close();

                    System.exit(0);


                default:

                    System.out.println("Invalid Option");

            }

        }

    }
}