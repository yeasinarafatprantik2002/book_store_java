package book;

public class Book {
    protected String isbn;
    protected String bookTitle;
    protected String authorName;
    protected double price;
    protected int availableQuantity;

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void addQuantity(int amount) {
        if (amount > 0) {
            availableQuantity += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void sellQuantity(int amount) {
        if (amount > 0 && amount <= availableQuantity) {
            availableQuantity -= amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void showDetails() {
        System.out.println("\n********************************");
        System.out.println("ISBN: " + isbn);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Available Quantity: " + availableQuantity);
        System.out.println("********************************\n");
    }

}
