public class ElectricCar extends Vehicle{
    public void chargeBattery() {
        System.out.println("Battery has been charged");
    }
    @Override
    void startEngine() {
        System.out.println("Electric car engine has started");
    }
}
