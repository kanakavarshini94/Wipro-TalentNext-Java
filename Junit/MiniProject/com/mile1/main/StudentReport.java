package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

    public String validate(Student student)
            throws NullStudentException,
                   NullNameException,
                   NullMarksArrayException {

        if (student == null)
            throw new NullStudentException();

        if (student.name == null)
            throw new NullNameException();

        if (student.marks == null)
            throw new NullMarksArrayException();

        int total = 0;

        for (int mark : student.marks)
            total += mark;

        double avg = total / student.marks.length;

        if (avg >= 80)
            return "A";

        else if (avg >= 60)
            return "B";

        else if (avg >= 40)
            return "C";

        else
            return "F";
    }
}