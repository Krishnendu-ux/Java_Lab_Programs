class PrintQueue {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        Thread user1 = new Thread(new User("Alice", sharedPrinter, "ProjectReport.pdf"));
        Thread user2 = new Thread(new User("Bob", sharedPrinter, "Financials.xlsx"));
        Thread user3 = new Thread(new User("Cara", sharedPrinter, "Presentation.ppt"));

        user1.start();
        user2.start();
        user3.start();
    }
}

class Printer {
    public synchronized void printDocument(String userName, String documentName) {
        System.out.println(userName + " starts printing: " + documentName);

        try {
            Thread.sleep(1000); // Simulate time taken to print
        } catch (InterruptedException e) {
            System.out.println("Printing interrupted for: " + documentName);
        }

        System.out.println(userName + " finished printing: " + documentName);
    }
}

class User implements Runnable {
    private final String userName;
    private final Printer printer;
    private final String documentName;

    public User(String userName, Printer printer, String documentName) {
        this.userName = userName;
        this.printer = printer;
        this.documentName = documentName;
    }

    @Override
    public void run() {
        printer.printDocument(userName, documentName);
    }
}
