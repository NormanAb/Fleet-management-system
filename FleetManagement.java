public class FleetManagement {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Prius";
        car1.year = 2024;

        Motorcycle motorcycle1 = new Motorcycle();
        motorcycle1.brand = "BMW";
        motorcycle1.model = "Heritage";
        motorcycle1.year = 2023;

        Truck truck1 = new Truck();
        truck1.brand = "Chevrolet";
        truck1.model = "Silverado";
        truck1.year = 2024;

        ElectricCar ec1 = new ElectricCar();
        ec1.brand = "Tesla";
        ec1.model = "S";
        ec1.year = 2023;

        car1.displayInfo();
        car1.startEngine();

        System.out.println("");

        motorcycle1.displayInfo();
        motorcycle1.startEngine();

        System.out.println("");

        truck1.displayInfo();
        truck1.startEngine();

        System.out.println("");

        ec1.displayInfo();
        ec1.chargeBattery();

    }
}