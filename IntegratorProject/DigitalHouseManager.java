package IntegratorProject;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Student> studentList;
    private List<Teacher> teacherList;
    private List<Course> courseList;
    private List<Enrolment> enrolmentList;

    public DigitalHouseManager(){
        this.teacherList = new ArrayList<>();
        this.studentList = new ArrayList<>();
        this.courseList = new ArrayList<>();
        this.enrolmentList = new ArrayList<>();
    }

    public DigitalHouseManager(List<Student> studentList, List<Teacher> teacherList, List<Course> courseList, List<Enrolment> enrolmentList){
        this.studentList = studentList;
        this.teacherList = teacherList;
        this.courseList = courseList;
        this.enrolmentList = enrolmentList;
    }

    public void addCourse(int id, String name, int maxStudents){
        Course course = new Course(id, name, maxStudents);
        boolean isAlreadyRegistered = false;
        for (Course c: this.courseList) {
            if(c.isTheSame(course)){
                isAlreadyRegistered = true;
            }
        }
        if(!isAlreadyRegistered){
            this.courseList.add(course);
        }
    }

    public void removeCourse(int courseId){
        for (Course c: this.courseList) {
            if(c.getId() == courseId){
                this.courseList.remove(c);
            }
        }
    }

    public void addAssistantTeacher(int id, String name, String lastName, int monitoringTime){
        AssistantTeacher assistantTeacher = new AssistantTeacher(id, 0, name, lastName, monitoringTime);
        boolean isAlreadyRegistered = false;
        for (Teacher c: this.teacherList) {
            if(c.isTheSame(assistantTeacher)){
                isAlreadyRegistered = true;
            }
        }
        if(!isAlreadyRegistered){
            this.teacherList.add(assistantTeacher);
        }
    }

    public void addHeadProfessor(int id, String name, String lastName, String expertize){
        HeadProfessor headProfessor = new HeadProfessor(id, 0, name, lastName, expertize);
        boolean isAlreadyRegistered = false;
        for (Teacher t: this.teacherList) {
            if(t.isTheSame(headProfessor)){
                isAlreadyRegistered = true;
            }
        }
        if(!isAlreadyRegistered){
            this.teacherList.add(headProfessor);
        }
    }

    public void removeTeacher(int teacherId){
        for (Teacher t: this.teacherList) {
            if(t.getId() == teacherId){
                this.teacherList.remove(t);
            }
        }
    }

    public void addStudent(int id, String name, String lastName){
        Student student = new Student(id, name, lastName);
        boolean isAlreadyRegistered = false;
        for (Student s: this.studentList) {
            if(s.isTheSame(student)){
                isAlreadyRegistered = true;
            }
        }
        if(!isAlreadyRegistered){
            this.studentList.add(student);
        }
    }

    public void enrollStudent(int studentId, int courseId){
        Student student = null;
        Course course = null;

        for (Course c: courseList) {
            if(c.getId() == courseId){
                course = c;
            }
        }

        for (Student s: studentList) {
            if(s.getId() == studentId){
                student = s;
            }
        }

        if(student == null || course == null){
            System.out.println("STUDENT OR COURSE NOT FOUND");
            return;
        }

        if(course.getMaxStudents() <= course.getStudentList().size()){
            System.out.println("COURSE IS FULL");
            return;
        }

        course.addStudent(student);

    }

    public void addTeachers(int courseId, int headProfessorId, int assistantTeacherId){
        AssistantTeacher assistantTeacher = null;
        HeadProfessor headProfessor = null;
        Course course = null;

        for (Teacher t: teacherList) {
            if(t.getId() == assistantTeacherId){
                assistantTeacher = (AssistantTeacher) t;
            }
            if(t.getId() == headProfessorId){
                headProfessor = (HeadProfessor) t;
            }
        }

        for (Course c: courseList) {
            if(c.getId() == courseId){
                course = c;
            }
        }

        if(assistantTeacher == null || course == null || headProfessor == null){
            System.out.println("TEACHERS OR COURSE NOT FOUND");
            return;
        }

        course.setHeadProfessor(headProfessor);
        course.setAssistantTeacher(assistantTeacher);

    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Course> getStudentCourses(Student student){
        List<Course> ret = new ArrayList<>();
        for (Course c: courseList) {
            for (Student s: c.getStudentList()) {
                if(s.equals(student)){
                    ret.add(c);
                }
            }
        }
        return ret;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public List<Enrolment> getEnrolmentList() {
        return enrolmentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setEnrolmentList(List<Enrolment> enrolmentList) {
        this.enrolmentList = enrolmentList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
