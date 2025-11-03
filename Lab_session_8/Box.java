public class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public void display() {
        System.out.println("Box contains: " + item);
    }
}

   