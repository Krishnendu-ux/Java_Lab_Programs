import edu.bank.*;

public class LoanTest {
    public static void main(String[] args) {
        Loan home = new HomeLoan();
        Loan car = new CarLoan();

        home.applyLoan(500000);
        car.applyLoan(300000);

        System.out.println("--- Home Loan ---");
        home.displayDetails();

        System.out.println("--- Car Loan ---");
        car.displayDetails();
    }
}
