public class ElectricCar extends CarSkeleton{
    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    private double avgKmPerCharge;
    private int batterySize;
    @Override
    public void startEngine() {
        System.out.println("ElectricCar "+ getName());
    }
    @Override
    public void drive() {
        System.out.println("ElectricCar drive "+ getName());
    }
}
