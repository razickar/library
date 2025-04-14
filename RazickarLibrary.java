package library;

import java.util.*;

public class RazickarLibrary {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        LibraryManagementSystem rzk = new LibraryManagementSystem();

        System.out.println("RAZICKAR LIBRARY....\n");

        while (true) {
            System.out.println("ENTER YOUR CHOICE...");
            System.out.println("1. LOGIN");
            System.out.println("2. REGISTER");
            System.out.println("3. LOGOUT");
            System.out.println("4. ADD BOOK (LIBRARIAN ONLY)");
            System.out.println("5. EXIT");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter USERNAME:");
                    String loginUserName = sc.nextLine();
                    System.out.println("Enter PASSWORD:");
                    String loginUserPassword = sc.nextLine();
                    rzk.login(loginUserName, loginUserPassword);
                    break;

                case 2:
                    System.out.println("Enter USERNAME:");
                    String registerUserName = sc.nextLine();
                    System.out.println("Enter PASSWORD:");
                    String registerUserPassword = sc.nextLine();
                    System.out.println("Enter your Position (student/staff/librarian):");
                    String registerUserPosition = sc.nextLine();
                    rzk.register(registerUserPosition, registerUserName, registerUserPassword);
                    break;

                case 3:
                    rzk.logout();
                    break;

                case 4:
                    Librarian lib_owner = rzk.getLibrarian();
                    if (lib_owner != null) {
                        System.out.println("Enter Book Name:");
                        String bookName = sc.nextLine();
                        System.out.println("Enter ISBN:");
                        String isbn = sc.nextLine();
                        System.out.println("Enter Author:");
                        String author = sc.nextLine();
                        System.out.println("Enter Publication:");
                        String pub = sc.nextLine();
                        lib_owner.addBook(bookName, isbn, author, pub);
                    } else {
                        System.out.println("Only a librarian can add books.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Enter a valid option.");
            }
        }
    }
}
