package Junit.MiniProject.com.mile1.test;

import com.mile1.bean.Student;
import com.mile1.main.StudentReport;
import com.mile1.main.StudentService;

public class StudentTest {

    public static void main(String[] args) {

        Student data[] = new Student[5];

        data[0] = new Student("Rahul", new int[]{90,80,90});
        data[1] = new Student("Priya", new int[]{30,20,25});
        data[2] = new Student(null, new int[]{80,70,90});
        data[3] = new Student("John", null);
        data[4] = null;

        StudentReport report = new StudentReport();

        System.out.println("------GRADE REPORT------");

        for (Student s : data) {

            try {
                System.out.println(report.validate(s));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        StudentService service = new StudentService();

        System.out.println();
        System.out.println("Null Name Count : "
                + service.findNumberOfNullName(data));

        System.out.println("Null Marks Count : "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Null Student Count : "
                + service.findNumberOfNullObjects(data));
    }
}