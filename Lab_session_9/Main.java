import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        StudentMarks list = new StudentMarks();
        Scanner sc = new Scanner(System.in);

        // Sample demo of CRUD:
        // Add some marks
        list.addMark(90);
        list.addMark(75);
        list.addMark(88);

        list.displayMarks();

        // Update mark at index 1
        list.updateMark(1, 80);
        System.out.println("After update:");
        list.displayMarks();

        // Delete mark at index 0
        list.deleteMark(0);
        System.out.println("After deletion:");
        list.displayMarks();

        sc.close();
    }
}
