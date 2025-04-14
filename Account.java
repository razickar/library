package library;

public class Account {
    int num_borrowed_books;
    int num_reserved_books;
    int num_returned_books;
    int num_lost_books;
    double fine_amount;

    public Account(int num_borrowed_books, int num_reserved_books, int num_returned_books, int num_lost_books) {
        this.num_borrowed_books = num_borrowed_books;
        this.num_reserved_books = num_reserved_books;
        this.num_returned_books = num_returned_books;
        this.num_lost_books = num_lost_books;
    }

    public void calculateFine() {
        fine_amount = num_lost_books * 100.0;
        System.out.println("Your fine amount is " + fine_amount);
    }
}