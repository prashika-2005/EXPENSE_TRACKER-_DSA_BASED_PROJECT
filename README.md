 Hostel Expense Tracker – Java Project
 A CLI-based Expense Management System for Hostel Students
Developed using Core Java (OOP + DSA), this project helps hostel students track their monthly expenses, pocket money, and savings.

* Project Structure
ExpenseTracker/
│
├── ExpenseTracker.java      # Main driver class (menu + user interface)
├── User.java                # User model: account info, expense logic
├── Expense.java             # Expense model: category, amount, date
└── UserManager.java         # Handles user registration & selection
* Project Objective
The goal of this project is to:

Allow hostel students to create accounts

Manage daily/monthly expenses

Set monthly income, pocket money, and savings

Analyze overspending behavior and generate tentative future plans

* Key Features
Feature	Description
1.Create Account	Register new users with email validation and age verification
2. Select Account	Switch between multiple user accounts
3. Add Expenses	Record expenses with category, amount, and date
4. View Expense History	See all expenses listed with full details
5. Set Pocket Money & Income	Input monthly income and allocate pocket money
6. Tentative Planning	Suggest budget adjustments based on spending
7. Input Validation	Robust checks for email, age, and date format

==== Expense Tracker Menu ====
1. Create an Account
2. Select Account
3. Add Expense
4. View Expenses
5. Set Pocket Money & Savings
6. View Tentative Plan (for next month)
7. Exit
Technologies Used
Technology	Purpose
Java	Core language for logic & flow
OOP	Object-oriented design (User, Expense)
Collections	Used ArrayList, LinkedList
Regex	Email validation
DSA Concepts	Linked List for expense storage
