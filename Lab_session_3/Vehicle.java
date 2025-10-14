class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
