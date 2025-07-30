package Expensetracker;

import java.util.*;
import java.util.regex.*;

public class UserManager {
    private List<User> users = new ArrayList<>();

    public User createAccount(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        int age;
        while (true) {
            try {
                System.out.print("Age: ");
                age = Integer.parseInt(scanner.nextLine());
                if (age > 0) break;
            } catch (Exception ignored) {}
            System.out.println("Invalid age.");
        }

        String email;
        do {
            System.out.print("Email: ");
            email = scanner.nextLine();
        } while (!isValidEmail(email));

        System.out.print("Password: ");
        String password = scanner.nextLine();

        User user = new User(name, address, age, email, password);
        users.add(user);
        System.out.println("Account created.");
        return user;
    }

    public User selectAccount(Scanner scanner) {
        if (users.isEmpty()) {
            System.out.println("No users available.");
            return null;
        }

        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i).name);
        }

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice < 1 || choice > users.size()) {
            System.out.println("Invalid choice.");
            return null;
        }

        return users.get(choice - 1);
    }

    private boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return Pattern.matches(regex, email);
    }
}
