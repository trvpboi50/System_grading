import java.util.Scanner;

public class course {
    private String courseCode;
    private String course_title;

    //constructors
    public course (){}
    public course(String courseCode,String course_title) {
        this.course_title=course_title;
        this.courseCode=courseCode;
    }
    //setter methods
    public void setCourseCode(String code) {
        this.courseCode =courseCode;
    }
    public void setCourse_title(String course_title){
        this.course_title=course_title;
    }
    //getter methods
    public String getCourseCode() {
        return courseCode;
    }
    public String getCourse_title(){
        return course_title;
    }
    //diplay methods
    public void dislayMethods(){
        System.out.println("Course ID "+ courseCode);
        System.out.println("Course title ;"+course_title);
    }
    //SetDetails
    public void setDetails(Scanner input){
        System.out.println("enter course_code :");
        this.courseCode=input.nextLine();
        System.out.println("enter course_Title :");
        this.course_title=input.nextLine();
    }
    /* public void setCourseName(String name){
        courseName = name;
    }
    public String getCourseName(){
        return courseName;
    }*/
}
