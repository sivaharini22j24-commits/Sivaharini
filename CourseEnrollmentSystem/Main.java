package CourseEnrollmentSystem;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        StudentInterface student1 = new Student(5,"Online");
        StudentInterface student2 = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter duration :");
        BigInteger courseDuration = new BigInteger(sc.nextLine());
        student2.setDuration(courseDuration.intValue());
        System.out.println("Enter Course type ");
        student2.setCourseType(sc.nextLine());


        if (student1.getCourseType()=="Online"){
            CourseInterface oc = new OnlineCourse(1604,2000,student1);
            student1.setOc(oc);
            oc.enroll();

            System.out.println("Fee :");
            System.out.println(student1.getOc().getFee());
            System.out.println("CourseId:");
            System.out.println(student1.getOc().getCourseId());


        }
        else{
            CourseInterface off = new OfflineCourse(2010,3000,student1);
            student1.setOff(off);
            off.enroll();

            System.out.println("Fee :");
            System.out.println(student1.getOff().getFee());
            System.out.println("CourseId:");
            System.out.println(student1.getOff().getCourseId());


        }

        if (student2.getCourseType()=="Online"){
            CourseInterface oc = new OnlineCourse(1765,3000,student2);
            student2.setOc(oc);
            oc.enroll();

            System.out.println("Fee :");
            System.out.println(student2.getOc().getFee());
            System.out.println("CourseId:");
            System.out.println(student2.getOc().getCourseId());


        }
        else{
            CourseInterface off = new OfflineCourse(1500,3000,student2);
            student2.setOff(off);
            off.enroll();

            System.out.println("Fee :");
            System.out.println(student2.getOff().getFee());
            System.out.println("CourseId:");
            System.out.println(student2.getOff().getCourseId());


        }



    }
}