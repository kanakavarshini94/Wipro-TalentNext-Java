package Junit.MiniProject.com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentService {

    StudentReport report = new StudentReport();

    public int findNumberOfNullMarksArray(Student[] students) {

        int count = 0;

        for (Student s : students) {
            try {
                report.validate(s);
            } catch (NullMarksArrayException e) {
                count++;
            } catch (Exception e) {
            }
        }

        return count;
    }

    public int findNumberOfNullName(Student[] students) {

        int count = 0;

        for (Student s : students) {
            try {
                report.validate(s);
            } catch (NullNameException e) {
                count++;
            } catch (Exception e) {
            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        for (Student s : students) {
            try {
                report.validate(s);
            } catch (NullStudentException e) {
                count++;
            } catch (Exception e) {
            }
        }

        return count;
    }
}