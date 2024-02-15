package domain;

import java.util.ArrayList;
import java.util.*;

 public class Student {
   private String studentNumber;
   private String name;
   private String program;
   private Integer totalUnitsEnrolled;
   private List<Course> courseList;

    public void setStudentNumber(String studentNumber) {
    this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
    return studentNumber;
    }

    public void setName(String name) {
        this.name = name;
       }

    public String getName() {
        return name;
       }

    public void setProgram(String program) {
        this.program = program;
       }

    public String getProgram() {
        return program;
       }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
       }

    public List<Course> getCourseList() {
        return courseList;
       }

    public void setTotalUnitsEnrolled(Integer totalUnitsEnrolled) {
        this.totalUnitsEnrolled = totalUnitsEnrolled;
       }
        
    public int getTotalUnitsEnrolled() {
        int totalUnits = 0;
        for(Course course : courseList){
        totalUnits += course.getUnit();
       }

    
 return totalUnits;
 }
}