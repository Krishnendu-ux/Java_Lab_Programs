class Car extends Vehicle {
    String model;

    Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Model: " + model);
    }
}
