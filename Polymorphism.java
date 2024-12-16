// Parent class: Publication
class Publication {
    protected String title;
    protected double price;
    protected int copies;

    // Constructor
    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    // Method to calculate total sales
    public double saleCopy() {
        return copies * price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Price: " + price + ", Copies: " + copies);
    }
}

// Derived class: Book
class Book extends Publication {
    private String author;

    // Constructor
    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    // Method to add more copies
    public void orderCopies(int num) {
        copies += num;
        System.out.println(num + " copies ordered for Book: " + title);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Author: " + author);
    }
}

// Derived class: Magazine
class Magazine extends Publication {
    private String currentIssue;

    // Constructor
    public Magazine(String title, double price, int copies, String currentIssue) {
        super(title, price, copies);
        this.currentIssue = currentIssue;
    }

    // Method to update issue
    public void receiveIssue(String issue) {
        currentIssue = issue;
        System.out.println("New issue received for Magazine: " + title + " - Issue: " + currentIssue);
    }

    // Method to update number of copies
    public void orderQty(int qty) {
        copies += qty;
        System.out.println(qty + " copies ordered for Magazine: " + title);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Current Issue: " + currentIssue);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create Book object
        Book book = new Book("Java Programming", 499.99, 50, "James Gosling");
        book.display();
        book.orderCopies(20); // Add more copies
        System.out.println("Total Sale (Book): " + book.saleCopy());

        // Create Magazine object
        Magazine magazine = new Magazine("Tech Monthly", 199.99, 30, "December 2024");
        magazine.display();
        magazine.orderQty(10); // Add more copies
        magazine.receiveIssue("January 2025"); // Update issue
        System.out.println("Total Sale (Magazine): " + magazine.saleCopy());

        // Calculate total sales
        double totalSales = book.saleCopy() + magazine.saleCopy();
        System.out.println("\nTotal Sales of Publications: " + totalSales);
    }
}
