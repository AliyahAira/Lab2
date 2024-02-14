package techServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import domain.Course;

public class CourseDA {
    private ArrayList <Course> courseList;

    public CourseDA (String studentNumber) throws FileNotFoundException {
        //read scheduleInfo file
        Scanner scheduleInfo = new Scanner (
                 new FileReader("scheduleInfo.csv"));

        courseList = new ArrayList<Course>();
        
        while(scheduleInfo.hasNext()) {
            String rowCourse = new String();
            rowCourse = scheduleInfo.nextLine();

            String[] rowCourseList = new String[6];
            rowCourseList = rowCourse.split(",");

            if(studentNumber.equals(rowCourseList[0])) {
                //create Course object
                Course course = new Course();

                //put data in course object
                course.setCourseCode(rowCourseList[1].trim());
                course.setDescription(rowCourseList[2].trim());
                course.setUnit(Integer.parseInt(rowCourseList[3].trim()));
                course.setDay(rowCourseList[4].trim());
                course.setTime(rowCourseList[5].trim());

                courseList.add(course);
            }
        }
        scheduleInfo.close();
    }
    public ArrayList<Course> getCourseList() {
        return courseList;
    }
}