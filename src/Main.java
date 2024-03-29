public class Main {
    public static void main(String[] args) {
        CarSkeleton carSkeleton= new CarSkeleton("A", "description");
        carSkeleton.runEngine();
        carSkeleton.drive();
        carSkeleton.startEngine();

        System.out.println("******************************************************************************");
        CarSkeleton hybridCar= new HybridCar("hyundaihybrid","hybrid",10.0,70,8);
        hybridCar.startEngine();
        hybridCar.drive();
        hybridCar.runEngine();
        System.out.println("******************************************************************************");
        CarSkeleton electicCar= new ElectricCar("opelelectric","electric",12.5,80);
        electicCar.startEngine();
        electicCar.drive();
        electicCar.runEngine();
        System.out.println("******************************************************************************");
        CarSkeleton gasPoweredCar= new GasPoweredCar("tofas","tofasgas",13.5,6);
        gasPoweredCar.startEngine();
        gasPoweredCar.drive();
        gasPoweredCar.runEngine();
        System.out.println("******************************************************************************");
        Car car = new Car(8, "Base car");

        car.startEngine();

        car.accelerate();

        car.brake();

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        mitsubishi.startEngine();

        mitsubishi.accelerate();

        mitsubishi.brake();
        Car ford = new Ford(6, "Ford Falcon");

        ford.startEngine();

        ford.accelerate();

        ford.brake();

        Car holden = new Holden(6, "Holden Commodore");

        holden.startEngine();
        holden.accelerate();
        holden.brake();
    }
}