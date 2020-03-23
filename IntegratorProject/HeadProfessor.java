package IntegratorProject;

public class HeadProfessor extends Teacher {
    private String expertize;

    public HeadProfessor(int id, int serviceAge, String name, String lastName, String expertize){
        super(id, serviceAge, name, lastName);
        this.expertize = expertize;
        System.out.println("Created " + this.toString());
    }

    @Override
    public String toString() {
        return "HeadProfessor{" +
                "id=" + super.getId() +
                ", serviceAge=" + super.getServiceAge() +
                ", name='" + super.getName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                "expertize='" + expertize + '\'' +
                '}';
    }

    public String getExpertize() {
        return expertize;
    }

    public void setExpertize(String expertize) {
        this.expertize = expertize;
    }
}
