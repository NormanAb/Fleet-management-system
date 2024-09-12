public abstract class Vehicle {
    String brand;
    String model;
    int year;

    abstract void startEngine();

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
