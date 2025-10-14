package edu.bank;

public class CarLoan implements Loan {
    double principal;
    double interestRate = 9.0;

    public void applyLoan(double amount) {
        principal = amount;
    }

    public void displayDetails() {
        System.out.println("Car Loan Principal: " + principal);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
