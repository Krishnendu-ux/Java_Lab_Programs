package edu.bank;

public class HomeLoan implements Loan {
    private double principal;
    private double rate;
    private int years;

    public HomeLoan(double principal, double rate, int years) {
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }

    @Override
    public void calculateInterest() {
        double interest = (principal * rate * years) / 100;
        System.out.println(" Home Loan Interest: Rs:" + interest);
    }
}