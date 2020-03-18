package Initial;

public class Duck implements Flyer {

    private int energy;

    @Override
    public void fly() {
        this.energy = this.energy - 5;
        System.out.println("Flying as a duck...");
    }
}
