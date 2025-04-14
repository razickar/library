package library;

import java.util.*;

public class Librarian extends User {
    private List<Book> books = new ArrayList<>();

    public Librarian(String userName, int id, String password) {
        super(userName, id, password);
        
    }

    public void addBook(String bookName, String ISBN, String author, String publication) {
        Book book = new Book(bookName, ISBN, author, publication);
        books.add(book);
        System.out.println("Book added: " + bookName);
    }

    public void viewBooks() {
        for (Book b : books) {
            System.out.println(b.getBookName() + " by " + b.getAuthor());
        }
    }
}