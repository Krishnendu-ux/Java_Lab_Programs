import java.util.*;

class Product {
  final String name;
  final double price;
  Product(String name, double price) { this.name = name; this.price = price; }
  public String toString() { return name + " - " + price; }
}

public class SortProducts {
  public static void main(String[] args) {
    List<Product> products = Arrays.asList(
      new Product("Mouse", 799.0),
      new Product("Keyboard", 1299.0),
      new Product("mouse", 799.0),
      new Product("Monitor", 8999.0),
      new Product("Adapter", 799.0)
    );

    // sort by price asc, then name (case-insensitive) asc
    products.sort(
      Comparator.comparingDouble((Product p) -> p.price)
                .thenComparing(p -> p.name.toLowerCase())
    );

    products.forEach(System.out::println);
  }
}
