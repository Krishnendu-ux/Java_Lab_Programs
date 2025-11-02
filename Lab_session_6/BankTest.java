public class BankTest {
    public static void main(String[] args) {
        // Create an account and perform a few transactions
        BankAccount acct = new BankAccount("AC1001", 3000.0);

        System.out.println("=== Session start ===");
        System.out.println("Creating account AC1001 with opening balance 3000.0");

        // Deposit (BankAccount prints the new balance)
        acct.deposit(500.0);

        // Try a successful withdrawal followed by one that may fail
        try {
            acct.withdraw(2000.0);   // should succeed if balance >= 2000
            acct.withdraw(2000.0);   // may throw LowBalanceException
        } catch (LowBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } finally {
            System.out.println("=== Session end ===");
        }
    }
}
