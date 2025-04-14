package library;

import java.util.*;

public class LibraryManagementSystem {
    private Map<String, User> users = new HashMap<>();
    private String workingUserName;
    private Librarian librarian;

    public void register(String userType, String userName, String userPassword) {
        if (users.containsKey(userName)) {
            System.out.println("Username already exists.\n");
            return;
        }

        User newUser = null;
        switch (userType.toLowerCase()) {
            case "student":
                Account studentAccount = new Account(0, 0, 0, 0);
                newUser = new Student(userName, users.size() + 1, userPassword, studentAccount);
                break;
            case "staff":
                Account staffAccount = new Account(0, 0, 0, 0);
                newUser = new Staff(userName, users.size() + 1, userPassword, staffAccount);
                break;
            case "librarian":
                librarian = new Librarian(userName, users.size() + 1, userPassword);
                newUser = librarian;
                break;
            default:
                System.out.println("\nInvalid user, typo Mistake.");
                return;
        }
        users.put(userName, newUser);
        System.out.println("\nThank you for registration!\n");
    }

    public boolean login(String userName, String password) {
        if (users.containsKey(userName)) {
            User user = users.get(userName);
            if (user.getPassword().equals(password)) {
                System.out.println("Login successful!\n");
                workingUserName = userName;
                return true;
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("USER not found.");
        }
        return false;
    }

    public void logout() {
        System.out.println("User logged out.");
        workingUserName = null;
    }

    public Librarian getLibrarian() {
        return librarian;
    }
}
