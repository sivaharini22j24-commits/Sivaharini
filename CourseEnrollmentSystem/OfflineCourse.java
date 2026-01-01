package CourseEnrollmentSystem;

public class OfflineCourse extends Course implements OfflineCourseInterface{

    public OfflineCourse(int id, int fee,StudentInterface student){
        this.setCourseId(id);
        this.setFee(fee);
        this.setStudent(student);
    }

}
