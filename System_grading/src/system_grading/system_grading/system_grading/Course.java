public class Course {
    public String courseCode;
    //public String courseName;
    public Course(){
        System.out.println("Courses: ");
    }
    public void setCourseCode(String code){
        courseCode = code;
    }
    public String getCourseCode(){
        return courseCode;
    }
    /*public void setCourseName(String name){
        courseName = name;
    }
    public String getCourseName(){
        return courseName;
    }*/
}
