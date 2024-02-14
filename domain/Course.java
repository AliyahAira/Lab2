package domain;

public class Course {
    private String courseCode;
    private String description;
    private Integer unit;
    private String day;
    private String time;
    
    //for courseCode
    public String getCourseCode(){
        return courseCode;
    }
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }

    //for description
    public String getDescription(){
        return description;
    }
    public void setDescription (String description){
        this.description = description;
    }

    //for unit = an integer
    public Integer getUnit(){
        return unit;
    }
    public void setUnit (Integer unit){
        this.unit = unit;
    }

    //for day
    public String getDay(){
        return day;
    }
    public void setDay (String day){
        this.day = day;
    }

    //for time
    public String getTime(){
        return time;
    }
    public void setTime (String time){
        this.time = time;
    }

    public String toString() {
        return String.format("%-12s%-30s%-8s%-10s%-10s\n", courseCode, description, unit, day, time + "\n");
    }

}