public class BankTest {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount("S1001", 5000, 5);
        Account a2 = new CurrentAccount("C2001", 10000, 2000);

        a1.deposit(1000);
        a1.withdraw(2000);

        a2.deposit(500);
        a2.withdraw(12000);

        System.out.println("\n--- Savings Account ---");
        a1.display();

        System.out.println("\n--- Current Account ---");
        a2.display();
    }
}
