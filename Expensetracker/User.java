package Expensetracker;

import java.util.*;

public class User {
    String name, address, email, password;
    int age;
    double pocketMoney, savings, totalIncome;
    List<expense> expenses;

    public User(String name, String address, int age, String email, String password) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.email = email;
        this.password = password;
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Scanner scanner) {
        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        expenses.add(new expense(category, amount, date));
        System.out.println("Expense added.");
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }

        for (expense e : expenses) {
            System.out.println(e);
        }
    }

    public void setPocketMoneyAndSavings(Scanner scanner) {
        System.out.print("Enter your total income: ");
        this.totalIncome = scanner.nextDouble();
        System.out.print("Enter your pocket money: ");
        this.pocketMoney = scanner.nextDouble();
        scanner.nextLine();

        this.savings = this.totalIncome - this.pocketMoney;
        System.out.println("Savings set: " + savings);
    }

    public double getTotalExpenses() {
        return expenses.stream().mapToDouble(expense::getAmount).sum();
    }

    public void viewTentativePlan() {
        double spent = getTotalExpenses();
        double expected = pocketMoney + savings;

        System.out.println("Total Spent: " + spent);
        System.out.println("Expected Income: " + expected);

        if (spent > expected) {
            double extra = spent - expected;
            System.out.println("Overspent by: " + extra);
            System.out.println("Plan for next month: Spend less by ₹" + extra);
        } else {
            System.out.println("You are on track!");
        }
    }
}
