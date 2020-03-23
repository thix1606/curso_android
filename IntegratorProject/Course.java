package IntegratorProject;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String name;
    private HeadProfessor headProfessor;
    private AssistantTeacher assistantTeacher;
    private List<Student> studentList;
    private int maxStudents;

    public Course(){
    }

    public Course(int id, String name, int maxStudents){
        this.id = id;
        this.name = name;
        this.maxStudents = maxStudents;
        this.studentList = new ArrayList<>();
    }

    public Course(int id, String name, HeadProfessor headProfessor, AssistantTeacher assistantTeacher, List<Student> studentList ){
        this.id = id;
        this.name = name;
        this.headProfessor = headProfessor;
        this.assistantTeacher = assistantTeacher;
        this.studentList = studentList;
        this.maxStudents = studentList.size();
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", headProfessor=" + headProfessor +
                ", assistantTeacher=" + assistantTeacher +
                ", studentList=" + studentList +
                ", maxStudents=" + maxStudents +
                '}';
    }

    public boolean addStudent(Student student){
        System.out.println("Student" + student.toString() + " added to course" + this.toString());
        return this.studentList.add(student);
    }

    public boolean removeStudent(Student student){
        System.out.println("Student" + student.toString() + " removed from course" + this.toString());
        return this.studentList.remove(student);
    }

    public boolean isTheSame(Course course){
        if(course.id == this.id){
            return true;
        }
        return false;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AssistantTeacher getAssistantTeacher() {
        return assistantTeacher;
    }

    public HeadProfessor getHeadProfessor() {
        return headProfessor;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setAssistantTeacher(AssistantTeacher assistantTeacher) {
        this.assistantTeacher = assistantTeacher;
    }

    public void setHeadProfessor(HeadProfessor headProfessor) {
        this.headProfessor = headProfessor;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }
}
