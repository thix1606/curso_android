package Class11;

import java.util.ArrayList;
import java.util.HashMap;

public class BookStore {
    private HashMap<String,Book> inventory = new HashMap<>();

    public BookStore(){
    }

    public void addBook(Book book){
        this.inventory.put(book.getIsbnCode(),book);
        System.out.println("Added book to inventory: " + book.toString());
    }

    public Book getBook(String isbnCode){
        Book book = inventory.get(isbnCode);
        if(book != null){
            System.out.println(book.toString());
            return book;
        }else{
            System.out.println("Book " + isbnCode + " was not found");
            return null;
        }
    }

    @Override
    public String toString() {
        return "BookStore:\n" +
                getBooks();
    }

    public String getBooks(){
        String ret = "";
        for (String bookCode: this.inventory.keySet()) {
            Book book = getBook(bookCode);
            ret = ret + book.toString();
        }
        return ret;
    }

    public boolean sellBook(String isbnCode){
        Book book = inventory.get(isbnCode);
        if(book != null){
            if(book.getInventoryQuantity() > 0){
                book.setInventoryQuantity( book.getInventoryQuantity() - 1);
                System.out.println("Book " + isbnCode + " was successfully sold");
                System.out.println(book.toString());
                return true;
            }else{
                System.out.println("Book " + isbnCode + " is sold out");
            }
        }else{
            System.out.println("Book " + isbnCode + " was not found");
        }
        return false;
    }

    public void setInventory(HashMap<String, Book> inventory) {
        this.inventory = inventory;
    }

    public HashMap<String, Book> getInventory() {
        return inventory;
    }

}
