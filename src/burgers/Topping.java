package burgers;

public class Topping {
    private String name;
    private double price;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class TomatoTopping extends Topping{

    public TomatoTopping() {
        super("tomato", 20.0);
    }
}

class OlivesTopping extends Topping{
    public OlivesTopping() {
        super("olives", 10.24);
    }
}

class OnionTopping extends Topping{
    public OnionTopping() {
        super("onion", 15.33);
    }
}

class LettuceTopping extends Topping{
    public LettuceTopping() {
        super("lettuce", 12.08);
    }
}

class LemonTopping extends Topping{
    public LemonTopping() {
        super("lemon", 13.11);
    }
}

class KaleTopping extends Topping{
    public KaleTopping() {
        super("kale", 22.08);
    }
}

class ChipsTopping extends Topping{
    public ChipsTopping() {
        super("chips", 9.97);
    }
}

class DrinksTopping extends Topping{
    public DrinksTopping() {
        super("drinks", 13.45);
    }
}
