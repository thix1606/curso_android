package Initial;

public class ControlTower {

    public static void flyAll(){
        Superman superman = new Superman();
        Duck duck = new Duck();
        Plane plane = new Plane();

        superman.fly();
        duck.fly();
        plane.fly();

    }

    public static void main(String args[]){
        flyAll();
    }
}
