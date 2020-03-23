package IntegratorProject;

import java.util.Date;

public class Enrolment {
    private Student student;
    private Course course;
    private Date date;

    public Enrolment(){
    }

    public Enrolment(Student student, Course course){
        this.student = student;
        this.course = course;
        this.date = new Date();
    }

    public Course getCourse() {
        return course;
    }

    public Date getDate() {
        return date;
    }

    public Student getStudent() {
        return student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
