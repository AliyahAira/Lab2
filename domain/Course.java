package domain;

public class Course {
    private String courseCode;
    private String description;
    private Integer unit;
    private String day;
    private String time;


    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
        }
    public String getCourseCode() {
        return courseCode;
        }


    public void setDescription(String description) {
        this.description = description;
        }
    public String getDescription() {
        return description;
        }    


    public void setUnit( Integer unit) {
        this.unit = unit;
        }
    public Integer getUnit() {
        return unit;
        }


    public void setDay(String day) {
        this.day = day;
        }
    public String getDay() {
        return day;
        }


    public void setTime(String time) {
        this.time = time;
        }
    public String getTime() {
        return time;
        }
        
   }