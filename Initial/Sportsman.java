package Initial;

public class Sportsman {
    private String name;
    private int level;
    private int energy;

    public Sportsman(){

    }

    public Sportsman(String name, int level, int energy){
        this.name = name;
        this.level = level;
        this.energy = energy;
    }

    public int getLevel() {
        return level;
    }

    public int getEnergy() {
        return energy;
    }
}
