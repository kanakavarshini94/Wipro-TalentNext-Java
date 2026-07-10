package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;


public class StudentMain {


    public static void main(String args[]) {


        Student data[] = new Student[10];


        data[0] = new Student("A1", new int[]{72,73,74});

        data[1] = new Student("B1", new int[]{75,76,77});

        data[2] = new Student("C1", new int[]{99,99,99});

        data[3] = new Student("C3", new int[]{100,100,99});

        data[4] = new Student("B2", new int[]{13,88,13});

        data[5] = new Student("C3", new int[]{14,14,99});

        data[6] = new Student("A2", new int[]{77,55,12});

        data[7] = new Student(null, new int[]{13,88,13});

        data[8] = new Student("A2", null);

        data[9] = null;



        StudentReport report = new StudentReport();



        for(Student student : data) {

            try {

                String result = report.validate(student);


                if(result.equals("VALID")) {

                    System.out.println(
                    student.getName() + " Grade : "
                    + report.findGrades(student));

                }

            }

            catch(NullStudentObjectException e) {

                System.out.println(e);

            }

            catch(NullNameException e) {

                System.out.println(e);

            }

            catch(NullMarksArrayException e) {

                System.out.println(e);

            }

        }



        StudentService service = new StudentService();


        System.out.println(
        "Null Marks Array Count : "
        + service.findNumberOfNullMarksArray(data));


        System.out.println(
        "Null Name Count : "
        + service.findNumberOfNullName(data));


        System.out.println(
        "Null Object Count : "
        + service.findNumberOfNullObjects(data));


    }

}