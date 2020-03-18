package Initial;

public class SoccerPlayer {
    private String name;
    private int energy;
    private int joy;
    private int goals;
    private int experience;

    public SoccerPlayer(){
    }

    public SoccerPlayer(String name, int energy, int joy, int goals, int experience){
        this.name = name;
        this.energy = energy;
        this.joy = joy;
        this.goals = goals;
        this.experience = experience;
    }

    public void scoreGoal(){
        this.energy = this.energy - 5;
        this.joy = this.joy + 10;
        this.goals++;
        System.out.println("GOOOOAL!!!");
        System.out.printf("TOTAL GOALS: %s\n", this.goals);
    }

    public void run(){
        this.energy = this.energy - 10;
        System.out.println("I'm tired");
        System.out.printf("CURRENT ENERGY: %s\n", this.energy);
    }

    public void trainSession(int experience){
        System.out.printf("INITIAL EXPERIENCE: %s\n", this.experience);
        this.experience = this.experience + experience;
        System.out.printf("CURRENT EXPERIENCE: %s\n", this.experience);
    }

    public static void train(SoccerPlayer soccerPlayer){
        soccerPlayer.run();
        soccerPlayer.scoreGoal();
        soccerPlayer.run();
        soccerPlayer.trainSession(1);
    }
}
