package Class10;

import java.util.List;
import java.util.HashMap;

public class Locker {
    private int counter;
    private HashMap<Integer, List<Piece>> inventory;

    public Locker(){
        counter = 0;
        inventory = new HashMap<>();
    }

    public Integer storePiece(List<Piece> pieceList){
        counter++;
        inventory.put(counter, pieceList);

        System.out.println("Stored stuff in locker " + counter);
        for (Piece piece: pieceList) {
            System.out.println("\t" + piece.toString());
        }
        return counter;
    }

    public void showInventory(){
        for (Integer id: inventory.keySet()) {
            System.out.println("In locker " + id + " we have:");
            for (Piece piece: inventory.get(id)) {
                System.out.println("\t" + piece.getBrand() + " " + piece.getModel());
            }
        }
    }

    public void showInventory(int id){
        System.out.println("In locker " + id + "we have:");
        for (Piece piece: inventory.get(id)) {
            System.out.println("\t" + piece.getBrand() + " " + piece.getModel());
        }
    }

    public void returnPieces(int id){
        inventory.remove(id);
        System.out.println("Returned all pieces from locker " + id);
    }

    public HashMap<Integer, List<Piece>> getInventory() {

        return inventory;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setInventory(HashMap<Integer, List<Piece>> inventory) {
        this.inventory = inventory;
    }
}
