package system_grading.system_grading.system_grading;

public class AllMain {
    public static void main(String [] args){
        // my F_[{()}]
        CourseMain myCourse = new CourseMain("OT: Pentateuch");
        myCourse.setNumber("TBB 1111");
        myCourse.getNumber();
        //work
        Students st = new Students();
        st.displaySetdails();
    }
}
