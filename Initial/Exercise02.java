package Initial;

public class Exercise02 {
    public static void main(String args[]) {
        SoccerPlayer sp01 = new SoccerPlayer("Thiago", 100, 0, 0, 0);
        SoccerPlayer sp02 = new SoccerPlayer("Santos", 100, 0, 0, 0);

        SoccerPlayer.train(sp01);
        SoccerPlayer.train(sp02);
    }
}
