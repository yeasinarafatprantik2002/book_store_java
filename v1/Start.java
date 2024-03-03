import book.Book;
import stroybook.StoryBook;
import textbook.TextBook;
import java.util.Scanner;

public class Start {
    public static void menu() {
        System.out.println("\n//- Welcome to the Book Store -\\\\\n");
        System.out.println("1. Add Book");
        System.out.println("2. Show Book Details");
        System.out.println("3. Add Quantity Book");
        System.out.println("4. Sell Quantity Book");
        System.out.println("5. Exit \n");
        System.out.println("Enter your choice: ");
    }

    public static void addBook(Book b) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n********************************");
        System.out.println("Enter ISBN: ");
        b.setIsbn(input.nextLine());
        System.out.println("Enter Book Title: ");
        b.setBookTitle(input.nextLine());
        System.out.println("Enter Author Name: ");
        b.setAuthorName(input.nextLine());
        System.out.println("Enter Price: ");
        b.setPrice(input.nextDouble());
        System.out.println("Enter Available Quantity: ");
        b.setAvailableQuantity(input.nextInt());
        System.out.println("********************************\n");
        // input.close();

    }

    public static void addBook(StoryBook sb) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n********************************");
        System.out.println("Enter ISBN: ");
        sb.setIsbn(input.nextLine());
        System.out.println("Enter Book Title: ");
        sb.setBookTitle(input.nextLine());
        System.out.println("Enter Author Name: ");
        sb.setAuthorName(input.nextLine());
        System.out.println("Enter Price: ");
        sb.setPrice(input.nextDouble());
        System.out.println("Enter Available Quantity: ");
        sb.setAvailableQuantity(input.nextInt());
        System.out.println("********************************\n");
        // input.close();

    }

    public static void addBook(TextBook tb) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n********************************");
        System.out.println("Enter ISBN: ");
        tb.setIsbn(input.nextLine());
        System.out.println("Enter Book Title: ");
        tb.setBookTitle(input.nextLine());
        System.out.println("Enter Author Name: ");
        tb.setAuthorName(input.nextLine());
        System.out.println("Enter Price: ");
        tb.setPrice(input.nextDouble());
        System.out.println("Enter Available Quantity: ");
        tb.setAvailableQuantity(input.nextInt());
        System.out.println("********************************\n");
        // input.close();

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Book b = new Book();
        StoryBook sb = new StoryBook();
        TextBook tb = new TextBook();
        while (true) {
            menu();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    // System.out.println("\n********************************");
                    System.out.println();
                    System.out.println("1. Add Book");
                    System.out.println("2. Add Story Book");
                    System.out.println("3. Add Text Book\n");
                    System.out.println("Enter your choice: ");
                    int choice1 = input.nextInt();
                    // System.out.println("********************************\n");
                    switch (choice1) {
                        case 1:
                            addBook(b);
                            System.out.println("Book Added");
                            break;
                        case 2:
                            addBook(sb);
                            System.out.println("Story Book Added");
                            break;
                        case 3:
                            addBook(tb);
                            System.out.println("Text Book Added");
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n1. Show Book Details");
                    System.out.println("2. Show Story Book Details");
                    System.out.println("3. Show Text Book Details\n");
                    System.out.println("Enter your choice: ");
                    int choice2 = input.nextInt();
                    switch (choice2) {
                        case 1:
                            b.showDetails();
                            break;
                        case 2:
                            sb.showDetails();
                            break;
                        case 3:
                            tb.showDetails();
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                    break;
                case 3:
                    System.out.println("1. Add Quantity Book");
                    System.out.println("2. Add Quantity Story Book");
                    System.out.println("3. Add Quantity Text Book");
                    System.out.println("Enter your choice: ");
                    int choice3 = input.nextInt();
                    switch (choice3) {
                        case 1:
                            System.out.println("Enter Quantity: ");
                            b.addQuantity(input.nextInt());
                            break;
                        case 2:
                            System.out.println("Enter Quantity: ");
                            sb.addQuantity(input.nextInt());
                            break;
                        case 3:
                            System.out.println("Enter Quantity: ");
                            tb.addQuantity(input.nextInt());
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                    break;
                case 4:
                    System.out.println("1. sellQuantity Book");
                    System.out.println("2. sellQuantity Story Book");
                    System.out.println("3. sellQuantity Text Book");
                    System.out.println("Enter your choice: ");
                    int choice4 = input.nextInt();
                    switch (choice4) {
                        case 1:
                            System.out.println("Enter Quantity: ");
                            b.sellQuantity(input.nextInt());
                            break;
                        case 2:
                            System.out.println("Enter Quantity: ");
                            sb.sellQuantity(input.nextInt());
                            break;
                        case 3:
                            System.out.println("Enter Quantity: ");
                            tb.sellQuantity(input.nextInt());
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;

            }

        }

        // input.close();
    }
}