public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Generic", 2000);
        Car c = new Car("Toyota", 2020, "Corolla");
        ElectricCar e = new ElectricCar("Tesla", 2023, "Model S", 100);

        System.out.println("\n--- Vehicle ---");
        v.display();

        System.out.println("\n--- Car ---");
        c.display();

        System.out.println("\n--- Electric Car ---");
        e.display();
    }
}
