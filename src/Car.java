public class Car implements Locomotive{
    double weight;
    double velocity;
    String name;

    Car(){
        this.name = "car";
    }

    Car(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void setSpecs(double weight, double velocity) {
        this.weight = weight;
        this.velocity = velocity;
    }

    @Override
    public String move() {
        String message = this.name + " is moving!";
        return message;
    }

    @Override
    public double getMomentum() {
        return weight * velocity;
    }
}
