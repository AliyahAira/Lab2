package domain;

import java.util.ArrayList;

public class Student {
    private String studentNumber;
    private String name;
    private String program;
    private ArrayList<Course> courseList;
    //private Integer totalUnitsEnrolled;

    //for student number
    public String getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }

    //for name
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //for program 
    public String getProgram() {
        return program;
    }
    public void setProgram(String program){
        this.program = program;
    }

    //for arraylist
    public ArrayList<Course> getCourseList() {
        return courseList;
    }
    public void setCourseList (ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public String toString() {
        String studentOutput = "Student number: " + studentNumber + "\n" +
                               "Student name: " + name + "\n" +
                               "Program: " + program + "\n" + "\n";

        for (Course course : courseList) {
            studentOutput += course.toString();
        }

        return studentOutput;
    }


    //need pa dito ung total units enrolled
}