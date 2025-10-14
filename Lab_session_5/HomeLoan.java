package edu.bank;

public class HomeLoan implements Loan {
    double principal;
    double interestRate = 7.5;

    public void applyLoan(double amount) {
        principal = amount;
    }

    public void displayDetails() {
        System.out.println("Home Loan Principal: " + principal);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
