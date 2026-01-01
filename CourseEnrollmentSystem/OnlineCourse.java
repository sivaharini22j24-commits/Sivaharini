package CourseEnrollmentSystem;

public class OnlineCourse extends Course implements OnlineCourseInterface{
    public OnlineCourse(int id, int fee,StudentInterface student){
        this.setCourseId(id);
        this.setFee(fee);
        this.setStudent(student);
    }
}