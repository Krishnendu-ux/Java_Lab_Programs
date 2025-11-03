import java.util.ArrayList;
import java.util.Iterator;

public class StudentMarks {
    private ArrayList<Integer> marks = new ArrayList<>();

    public void addMark(int mark) {
        marks.add(mark);
    }

    public void updateMark(int index, int newMark) {
        if (index >= 0 && index < marks.size()) {
            marks.set(index, newMark);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void deleteMark(int index) {
        if (index >= 0 && index < marks.size()) {
            marks.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayMarks() {
        Iterator<Integer> itr = marks.iterator();
        System.out.println("Student Marks:");
        int i = 0;
        while (itr.hasNext()) {
            System.out.println("Index " + i + ": " + itr.next());
            i++;
        }
    }
}