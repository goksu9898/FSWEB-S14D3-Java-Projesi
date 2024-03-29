public class CarSkeleton {
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    private String name;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private  String description;
    public void startEngine() {
        System.out.println("carSkeleton starting.");
    }
    public void drive() {
        runEngine();
        System.out.println("carSkeleton going.");
    }
    protected void runEngine() {
        System.out.println("carSkeleton run engine.");
    }

}
