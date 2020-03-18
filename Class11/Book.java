package Class11;

public class Book {
    private String author;
    private String title;
    private String isbnCode;
    private Double price;
    private int releaseYear;
    private int inventoryQuantity;

    public void Book(){

    }

    public Book(String author, String title, String isbnCode, Double price, int releaseYear, int inventoryQuantity){
        this.author = author;
        this.title = title;
        this.isbnCode = isbnCode;
        this.price = price;
        this.releaseYear = releaseYear;
        this.inventoryQuantity = inventoryQuantity;
    }

    @Override
    public String toString() {
        return "\tBook: " +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isbnCode='" + isbnCode + '\'' +
                ", price=" + price +
                ", releaseYear=" + releaseYear +
                ", inventoryQuantity=" + inventoryQuantity;
    }

    public Double getPrice() {
        return price;
    }

    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setInventoryQuantity(int inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
