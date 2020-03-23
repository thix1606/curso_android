package IntegratorProject;

public class Teacher {
    private int id;
    private int serviceAge;
    private String name;
    private String lastName;

    public Teacher(){
    }

    public Teacher(int id, int serviceAge, String name, String lastName){
        this.id = id;
        this.serviceAge = serviceAge;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", serviceAge=" + serviceAge +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public boolean isTheSame(Teacher teacher){
        if(teacher.id == this.id){
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getServiceAge() {
        return serviceAge;
    }

    public void setServiceAge(int serviceAge) {
        this.serviceAge = serviceAge;
    }
}
