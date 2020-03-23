package IntegratorProject;

public class AssistantTeacher extends Teacher {
    private int monitoringTime;

    public AssistantTeacher(int id, int serviceAge, String name, String lastName, int monitoringTime){
        super(id, serviceAge, name, lastName);
        this.monitoringTime = monitoringTime;
        System.out.println("Created " + this.toString());
    }

    @Override
    public String toString() {
        return "AssistantTeacher{" +
                "id=" + super.getId() +
                ", serviceAge=" + super.getServiceAge() +
                ", name='" + super.getName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                "monitoringTime=" + monitoringTime +
                '}';
    }

    public int getMonitoringTime() {
        return monitoringTime;
    }

    public void setMonitoringTime(int monitoringTime) {
        this.monitoringTime = monitoringTime;
    }
}
