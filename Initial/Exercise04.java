package Initial;

public class Exercise04 {
    public static void main(String agrs[]){
        Tripod tripod = new Tripod(true,100, 200);

        tripod.isReadyToUse();

        tripod.isReadyToStore();

        tripod.use();

        tripod.setHeight(150);

        tripod.fold();

        tripod.unFold();

        tripod.store();

    }
}
