package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {


    public int findNumberOfNullMarksArray(Student studentArray[]) {

        int count = 0;


        if(studentArray != null) {

            for(Student student : studentArray) {

                if(student != null && student.getMarks() == null) {
                    count++;
                }

            }

        }


        return count;
    }



    public int findNumberOfNullName(Student studentArray[]) {

        int count = 0;


        if(studentArray != null) {

            for(Student student : studentArray) {

                if(student != null && student.getName() == null) {
                    count++;
                }

            }

        }


        return count;
    }



    public int findNumberOfNullObjects(Student studentArray[]) {

        int count = 0;


        if(studentArray != null) {

            for(Student student : studentArray) {

                if(student == null) {
                    count++;
                }

            }

        }


        return count;
    }

}