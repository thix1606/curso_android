package IntegratorProject;

public class Principal {
    public static void main(String args[]){
        DigitalHouseManager dhm = new DigitalHouseManager();

        dhm.addHeadProfessor(1, "Thiago", "Santos", "IT");
        dhm.addHeadProfessor(2, "Santos", "Thiago", "TI");

        dhm.addAssistantTeacher(3, "Zé", "Silva", 10);
        dhm.addAssistantTeacher(4, "Silva", "Zé", 20);

        dhm.addCourse(20001, "Full Stack", 3);
        dhm.addCourse(20002, "Android", 2);

        dhm.addTeachers(20001, 1,3);
        dhm.addTeachers(20002, 2,4);

        dhm.addStudent(1, "Student", "01");
        dhm.addStudent(2, "Student", "02");
        dhm.addStudent(3, "Student", "03");
        dhm.addStudent(4, "Student", "04");
        dhm.addStudent(5, "Student", "05");

        dhm.enrollStudent(1, 20001);
        dhm.enrollStudent(2, 20001);

        dhm.enrollStudent(3, 20002);
        dhm.enrollStudent(4, 20002);
        dhm.enrollStudent(5, 20002);

    }
}
