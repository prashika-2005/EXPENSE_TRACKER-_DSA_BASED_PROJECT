package Expensetracker;

public class expense {
    private String category;
    private double amount;
    private String date;

    public expense(String category, double amount, String date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Category: " + category + ", Amount: ₹" + amount + ", Date: " + date;
    }
}
