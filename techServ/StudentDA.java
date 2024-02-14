package techServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import domain.Student;

public class StudentDA {
    private ArrayList <Student> studentList;

    public StudentDA() throws FileNotFoundException {
        //read student info file
        Scanner studentInfo = new Scanner (
            new FileReader("studentInfo.csv"));
        studentList = new ArrayList<Student> ();

        while(studentInfo.hasNext()) {

            String rowStudent = new String();
            rowStudent = studentInfo.nextLine();

            String[] rowStudentList = new String[4];
            rowStudentList = rowStudent.split(",");

            //create Student object
            Student student = new Student();

            //store data in Student object
            student.setStudentNumber(rowStudentList[1].trim());
            student.setName(rowStudentList[2].trim());
            student.setProgram(rowStudentList[3].trim());

            //create courseDA
            CourseDA courseDA = new CourseDA(student.getStudentNumber());

            //attach the courseList to student object
            student.setCourseList(courseDA.getCourseList());

            studentList.add(student);
        }
        studentInfo.close();
    }
    public ArrayList<Student> getStudentList(){
        return studentList;
    }
}
