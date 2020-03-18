package Class11;

public class Main{
    public static void main(String args[]){
        BookStore bookStore = new BookStore();

        Book book1 = new Book("Thiago Santos", "Era uma vez", "1234", 100.0, 2020, 10);
        Book book2 = new Book("Paulo Coelho", "O Alquimista", "4321", 200.0, 1984, 10);

        System.out.println("Adding books to inventory:");
        bookStore.addBook(book1);
        bookStore.addBook(book2);

        System.out.println("*****************************************************************************************");
        System.out.println("Listing inventory:");
        bookStore.getBooks();

        System.out.println("*****************************************************************************************");
        System.out.println("Try to get book with wrong code from inventory:");
        bookStore.getBook("1233");

        System.out.println("*****************************************************************************************");
        System.out.println("Try to get two books with right code from inventory:");
        bookStore.getBook("1234");
        bookStore.getBook("4321");

        System.out.println("*****************************************************************************************");
        System.out.println("Try to sell book using wrong code:");
        bookStore.sellBook("1233");

        System.out.println("*****************************************************************************************");
        System.out.println("Try to sell book using right code:");
        bookStore.sellBook("1234");

    }
}
