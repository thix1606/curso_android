package Initial;

public class Race {
    private int difficultyLevel;
    private int requiredEnergy;

    public Race(){
    }

    public Race(int difficultyLevel, int requiredEnergy){
        this.difficultyLevel = difficultyLevel;
        this.requiredEnergy = requiredEnergy;
    }

    public boolean canCompete(Sportsman sportsman){
        if(this.difficultyLevel <= sportsman.getLevel() && this.requiredEnergy <= sportsman.getEnergy()){
            return true;
        }else{
            return false;
        }
    }
}
