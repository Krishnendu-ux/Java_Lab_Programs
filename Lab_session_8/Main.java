import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        
        intList.add(20);
        doubleList.add(2.4);
        doubleList.add(9.8);
        stringList.add("Apple");
        
        Box<Integer> intBox = new Box<>(intList.get(0));
        Box<Double> doubleBox = new Box<>(doubleList.get(1));
        Box<String> stringBox = new Box<>(stringList.get(0));

        intBox.display();
        doubleBox.display();
        stringBox.display();
    }
} 