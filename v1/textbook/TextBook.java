package textbook;

import book.Book;

public class TextBook extends Book {
    private String category = "TextBook";

    public void showDetails() {
        System.out.println("\n********************************");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Book Title: " + getBookTitle());
        System.out.println("Author Name: " + getAuthorName());
        System.out.println("Price: " + getPrice());
        System.out.println("Available Quantity: " + getAvailableQuantity());
        System.out.println("Category: " + category);
        System.out.println("********************************\n");
    }

}
