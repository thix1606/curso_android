package Initial;

public class Plane implements Flyer {

    private int flightHours;

    @Override
    public void fly() {
        this.flightHours = this.flightHours + 13;
        System.out.println("Flying as an airplane...");
    }
}
