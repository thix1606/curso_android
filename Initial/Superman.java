package Initial;

public class Superman implements Flyer {

    private int experience;

    @Override
    public void fly() {
        this.experience = this.experience + 3;
        System.out.println("Flying as a super hero...");
    }
}
