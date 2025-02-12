class Book {
    String title, author;
    int yearPublished;
    double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: " + price);
    }
}

class PrintedBook extends Book {
    int numberOfPages;

    public PrintedBook(String title, String author, int yearPublished, int numberOfPages, double price) {
        super(title, author, yearPublished, price);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void printBookDetails() {
        System.out.println("Printed Book Info:");
        super.printBookDetails();
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Book Type: PrintedBook\n");
    }

    public void printBook() {
        System.out.println("Printing the book...\n");
    }
}

class EBook extends Book {
    double fileSizeMB;
    String fileFormat;

    public EBook(String title, String author, int yearPublished, double fileSizeMB, String fileFormat, double price) {
        super(title, author, yearPublished, price);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
    }

    @Override
    public void printBookDetails() {
        System.out.println("EBook Info:");
        super.printBookDetails();
        System.out.println("File Size: " + fileSizeMB + " MB");
        System.out.println("File Format: " + fileFormat);
        System.out.println("Book Type: EBook\n");
    }
}

public class Library {
    public static void main(String[] args) {
        PrintedBook printedBook = new PrintedBook("To Kill a Mockingbird", "Harper Lee", 1960, 281, 500.10);
        EBook eBook = new EBook("Web Development Essentials", "Michael Brown", 2019, 5.2, "PDF", 1000);
        
        printedBook.printBookDetails();
        printedBook.printBook();

        eBook.printBookDetails();
    }
}
