public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public void startEngine() {
        System.out.println("the mitsubishi car's engine is starting."+ getName());
    }

    @Override
    public void accelerate() {

        System.out.println("the mitsubishi car is accelerating."+ getName());
    }

    @Override
    public void brake() {

        System.out.println("the mitsubishi car is braking."+ getName());
    }
}
