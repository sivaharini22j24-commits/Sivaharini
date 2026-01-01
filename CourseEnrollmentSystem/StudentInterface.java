package CourseEnrollmentSystem;

public interface StudentInterface{
    public int getDuration();
    public void setDuration(int duration);
    public String getCourseType();
    public void setCourseType(String courseType);
    public CourseInterface getOc();
    public void setOc(CourseInterface oc);
    public CourseInterface getOff();
    public void setOff(CourseInterface off);
}
