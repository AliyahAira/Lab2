package domain;

import java.io.FileNotFoundException;
import java.util.*;


public class COMReportVersion2 {
 public static void main(String [] args) throws FileNotFoundException{
 StringBuilder p = new StringBuilder();
 BlockSectionDA blockSectionDA = new BlockSectionDA();

     for(BlockSection blockSection: blockSectionDA.getBlockSectionList()){

      p.append("Block section code:").append(blockSection.getBlockCode()).append("\n");
      p.append("Description:").append(blockSection.getDescription()).append("\n");
      p.append("Adviser:").append(blockSection.getAdviser()).append("\n\n");


      p.append("Total Students:").append(blockSection.getTotalStudents()).append("\n\n");
      List<Student> s= blockSection.getStudentList();

        for(Student student: s) {
         p.append("Student number:").append(student.getStudentNumber()).append("\n");
         p.append("Student Name:").append(student.getName()).append("\n");
         p.append("Program: ").append(student.getProgram()).append("\n");
         p.append("Total units enrolled:").append(student.getTotalUnitsEnrolled()).append("\n\n");
         
         
         List<Course> c = student.getCourseList();

         p.append(String.format("%-10s %-25s %-10s %-8s %-15s","Course", "Description", "Units", "Day", "Time"));
            for (Course course : c) {
               p.append("\n");
               p.append(String.format("%-10s %-25s %-10s %-8s %-15s",course.getCourseCode(), course.getDescription()
               ,course.getUnit(), course.getDay(),course.getTime()));
          }
            p.append("\n");
            p.append("\n");
       }
    }
        System.out.println(p);
  }
}
