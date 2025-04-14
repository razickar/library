package library;

public class Book {
    private String bookName;
    private String ISBN;
    private String author;
    private String publication;

    public Book(String bookName, String ISBN, String author, String publication) {
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.author = author;
        this.publication = publication;
    }

    public String getBookName() { return bookName; }
    public String getISBN() { return ISBN; }
    public String getAuthor() { return author; }
    public String getPublication() { return publication; }
}
