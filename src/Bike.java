public class Bike extends Vehicle{
    private boolean abs;
    private int engineCapacity;

    public Bike(String name, boolean abs, int engineCapacity) {
        super(name);
        this.abs = abs;
        this.engineCapacity = engineCapacity;
    }
}
