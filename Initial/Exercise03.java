package Initial;

public class Exercise03 {
    public  static void main(String args[]){
        Race shortRace = new Race(100, 100);
        Race normalRace = new Race(200, 300);
        Race longRace = new Race(300, 300);

        Sportsman juniorAthlete = new Sportsman("Diego", 100, 100);
        Sportsman seniorAthlete = new Sportsman("Thiago", 1000, 1000);

        System.out.println("Junior athlete: ");
        System.out.println("Can compete on short race? " + shortRace.canCompete(juniorAthlete));
        System.out.println("Can compete on normal race? " + normalRace.canCompete(juniorAthlete));
        System.out.println("Can compete on long race? " + longRace.canCompete(juniorAthlete));

        System.out.println("Senior athlete: ");
        System.out.println("Can compete on short race? " + shortRace.canCompete(seniorAthlete));
        System.out.println("Can compete on normal race? " + normalRace.canCompete(seniorAthlete));
        System.out.println("Can compete on long race? " + longRace.canCompete(seniorAthlete));

    }
}
