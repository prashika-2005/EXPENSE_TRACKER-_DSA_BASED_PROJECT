package Expensetracker;

import java.util.Scanner;

public class Expensetrack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User currentUser = null;
        UserManager userManager = new UserManager();

        boolean running = true;
        while (running) {
            System.out.println("\n==== Expense Tracker Menu ====");
            System.out.println("1. Create an Account");
            System.out.println("2. Select Account");
            System.out.println("3. Add Expense");
            System.out.println("4. View Expenses");
            System.out.println("5. Set Pocket Money & Savings");
            System.out.println("6. View Tentative Plan (for next month)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    currentUser = userManager.createAccount(scanner);
                    break;
                case 2:
                    currentUser = userManager.selectAccount(scanner);
                    break;
                case 3:
                    if (currentUser != null)
                        currentUser.addExpense(scanner);
                    else
                        System.out.println("Select an account first.");
                    break;
                case 4:
                    if (currentUser != null)
                        currentUser.viewExpenses();
                    else
                        System.out.println("Select an account first.");
                    break;
                case 5:
                    if (currentUser != null)
                        currentUser.setPocketMoneyAndSavings(scanner);
                    else
                        System.out.println("Select an account first.");
                    break;
                case 6:
                    if (currentUser != null)
                        currentUser.viewTentativePlan();
                    else
                        System.out.println("Select an account first.");
                    break;
                case 7:
                    running = false;
                    System.out.println("Thank you for using the Expense Tracker!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
