import java.util.Objects;

public class Car {
    private boolean engine;

    public Car(int cylinders, String name) {
        this.wheels=4;
        this.engine=true;
        this.cylinders = cylinders;
        this.name = name;
    }

    private int cylinders;

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    private String name;

    private int wheels;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';

    }
    @Override
    public boolean equals(Object object){
        Car car= (Car) object;
        return cylinders == car.getCylinders() && name.equals(car.getName());
    }

    public void startEngine() {
        System.out.println("the car's engine is starting."+ name);
        System.out.println(getClass().getSimpleName());
    }

    public void accelerate() {
        System.out.println("the car is accelerating."+ name);
        System.out.println(getClass().getSimpleName());
    }

    public void brake() {
        System.out.println("the car is braking."+ name);
        System.out.println(getClass().getSimpleName());
    }
}
