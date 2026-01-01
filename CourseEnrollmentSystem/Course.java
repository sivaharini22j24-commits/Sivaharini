package CourseEnrollmentSystem;

public abstract class Course implements CourseInterface{
    private int courseId;
    private int fee;


    private StudentInterface student;



    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }


    public void enroll(){
        this.fee = this.fee * student.getDuration();
        System.out.println("Enrolled for");
        System.out.println(student.getDuration());
    }

    public StudentInterface getStudent() {
        return student;
    }

    public void setStudent(StudentInterface student) {
        this.student = student;
    }
}