
import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine(); // to consume newline

        System.out.print("Enter department: ");
        String dept = sc.nextLine();

        System.out.print("Enter salary: ");
        double sal = sc.nextDouble();

        Employee e = new Employee(name, id, dept, sal);

        // command line update: java EmployeeSystem 2000 "Finance"
        if (args.length == 2) {
            double inc = Double.parseDouble(args[0]);
            String newDept = args[1];
            e.salary = e.salary + inc;
            e.dept = newDept;
        }

        System.out.println("\nFinal Employee Details:");
        e.display();

        sc.close();
    }
}
