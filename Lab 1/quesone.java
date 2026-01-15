class Book {
    // Private data members
    private int bookID;
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Setter methods
    public void setBookID(int id) {
        bookID = id;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setPrice(double p) {
        if (p > 0) {
            price = p;
        } else {
            System.out.println("Invalid price! Price must be positive.");
            price = 0;
        }
    }

    public void setAvailability(boolean status) {
        isAvailable = status;
    }

    // Getter methods
    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean getAvailability() {
        return isAvailable;
    }
}

public class quesone 
{
        public static void main(String[] args) 
        {
            Book book1 = new Book();

            book1.setBookID(101);
            book1.setTitle("Clean Code");
            book1.setAuthor("Robert C. Martin");
            book1.setPrice(450.75);
            book1.setAvailability(true);

            System.out.println("Book ID: " + book1.getBookID());
            System.out.println("Title: " + book1.getTitle());
            System.out.println("Author: " + book1.getAuthor());
            System.out.println("Price: " + book1.getPrice());
            System.out.println("Available: " + (book1.getAvailability() ? "Yes" : "No"));
        }
}