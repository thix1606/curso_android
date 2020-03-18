package Class10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        Locker locker = new Locker();

        Jacket myJacket = new Jacket("Calvin Klein", "Leather");
        Coat myCoat = new Coat("No brand", "Jeans");

        Jacket herJacket = new Jacket("Armani", "Leather");
        Coat herCoat = new Coat("No brand", "Wool");

        List<Piece> myThings = new ArrayList<>();
        List<Piece> herThings = new ArrayList<>();

        myThings.add(myJacket);
        myThings.add(myCoat);

        herThings.add(herJacket);
        herThings.add(herCoat);

        int lockerId1 = locker.storePiece(myThings);
        int lockerId2 = locker.storePiece(herThings);

        locker.showInventory();

        locker.returnPieces(lockerId1);
        locker.returnPieces(lockerId2);

    }
}
