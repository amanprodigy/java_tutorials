package computer;

public class Case {
    private String model;
    private String manuf;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manuf, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manuf = manuf;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}
