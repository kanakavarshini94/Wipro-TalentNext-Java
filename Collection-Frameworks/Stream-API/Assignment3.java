import java.util.ArrayList;

public class Assignment3 {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Rahul", 75));
        students.add(new Student(102, "Anjali", 45));
        students.add(new Student(103, "Kiran", 60));
        students.add(new Student(104, "Sneha", 30));
        students.add(new Student(105, "Ravi", 85));

        // Count students with marks >= 50
        long count = students.stream()
                             .filter(student -> student.mark >= 50)
                             .count();

        System.out.println("Students who cleared the test:");

        students.stream()
                .filter(student -> student.mark >= 50)
                .forEach(System.out::println);

        System.out.println("\nNumber of students cleared: " + count);
    }
}