package domain;

import java.util.ArrayList;

public class BlockSection {
    private String blockCode;
    private String description;
    private String adviser;
    private ArrayList<Student> studentList;
    private Integer totalStudents;
    
    //blockcode
    public String getBlockCode(){
        return blockCode;
    }
    public void setBlockCode(String blockCode){
        this.blockCode = blockCode;
    }

    //description
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    //adviser
    public String getAdviser(){
        return adviser;
    }
    public void setAdviser(String adviser){
        this.adviser = adviser;
    }

    //arraylist
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public int getTotalStudentsEnrolled() {
        if (studentList != null) {
            return studentList.size();
        } else {
            return 0;
        }
    }


    public String toString() {
        String result = "Block section code: " + blockCode + "\n" +
                        "Description: " + description + "\n" +
                        "Adviser: " + adviser + "\n" + 
                        "Total Students Enrolled: " + getTotalStudentsEnrolled() + "\n";

        for (Student student : studentList) {
            result += student.toString();
        }

        return result;
    }
    

}