public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("the ford car's engine is starting."+ getName());
    }

    @Override
    public void accelerate() {
        System.out.println("the ford car is accelerating."+ getName());
    }

    @Override
    public void brake() {
        System.out.println("the ford car is braking."+ getName());
    }
}
