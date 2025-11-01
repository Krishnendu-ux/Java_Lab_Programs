import edu.bank.*;

public class Main {
    public static void main(String[] args) {
        Loan home = new HomeLoan(500000, 7.5, 15);
        Loan car = new CarLoan(300000, 9.0, 5);

        home.calculateInterest();
        car.calculateInterest();
    }
}