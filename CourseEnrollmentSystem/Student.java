package CourseEnrollmentSystem;

public class Student implements StudentInterface {

    private int duration;
    private String courseType;


    private CourseInterface oc;
    private CourseInterface off;

    public Student(int duration , String course){
        this.duration=duration;
        this.courseType = course;
    }
    public Student(){

    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public CourseInterface getOc() {
        return oc;
    }

    public void setOc(CourseInterface oc) {
        this.oc = oc;
    }

    public CourseInterface getOff() {
        return off;
    }

    public void setOff(CourseInterface off) {
        this.off = off;
    }
}
