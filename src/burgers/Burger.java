package burgers;

public class Burger {
    private String name;
    private double price;
    private String bread_type;
    private String meat;
    private int toppings_count = 0;
    private boolean hasTomatoTopping;
    private boolean hasLettuceTopping;
    private boolean hasOnionTopping;
    private boolean hasOlivesTopping;

    public Burger(String name, double price, String bread_type, String meat) {
        System.out.println("\n");
        this.name = name;
        this.price = price;
        this.bread_type = bread_type;
        this.meat = meat;
    }

    public Burger(String bread_type, String meat) {
        this("Classic Burger", 50, bread_type, meat);
        System.out.println("Preparing Classic Burger for you!");
    }

    public void add_topping(Topping topping){
        String topping_name = topping.getName();
        switch(topping_name){
            case "tomato":
                hasTomatoTopping = true;
                System.out.println("Tomato topping added!");
                break;
            case "lettuce":
                hasLettuceTopping = true;
                System.out.println("Lettuce topping added!");
                break;
            case "onion":
                hasOnionTopping = true;
                System.out.println("Onion topping added!");
                break;
            case "olives":
                hasOlivesTopping = true;
                System.out.println("Olives topping added!");
                break;
        }
    }

    public double getBasePrice(){
        return price;
    }

    public String getBread_type() {
        return bread_type;
    }

    public String getMeat() {
        return meat;
    }

    public int getToppings_count() {
        return toppings_count;
    }

    public double getTotalPrice(){
        double totalPrice = getBasePrice();
        if(hasTomatoTopping){
            TomatoTopping tomatoTopping = new TomatoTopping();
            totalPrice += tomatoTopping.getPrice();
        }
        if(hasOlivesTopping){
            OlivesTopping olivesTopping = new OlivesTopping();
            totalPrice += olivesTopping.getPrice();
        }
        if(hasOnionTopping){
            OnionTopping onionTopping = new OnionTopping();
            totalPrice += onionTopping.getPrice();
        }
        if(hasLettuceTopping){
            LettuceTopping lettuceTopping = new LettuceTopping();
            totalPrice += lettuceTopping.getPrice();
        }
        return totalPrice;
    }

    public void showPriceStructure(){
        System.out.println(" \n ------ Food Receipt ------");
        System.out.println("Base price: " + getBasePrice());
        System.out.println("Total price: " + getTotalPrice());
        if(hasOnionTopping){
            OnionTopping onionTopping = new OnionTopping();
            System.out.println("Onion Topping: " + onionTopping.getPrice());
        }
        if(hasLettuceTopping){
            LettuceTopping lettuceTopping = new LettuceTopping();
            System.out.println("Lettuce Topping: " + lettuceTopping.getPrice());
        }
        if(hasOlivesTopping){
            OlivesTopping olivesTopping = new OlivesTopping();
            System.out.println("Olives Topping: " + olivesTopping.getPrice());
        }
        if(hasTomatoTopping){
            TomatoTopping tomatoTopping = new TomatoTopping();
            System.out.println("Tomato Topping: " + tomatoTopping.getPrice());
        }
    }
}

class HealthyBurger extends Burger{
    private boolean hasKaleTopping;
    private boolean hasLemonTopping;

    public HealthyBurger(String meat) {
        super("Healthy Burger", 65, "brown rye", meat);
        System.out.println("Preparing Healthy Burger for you!");
    }

    @Override
    public void add_topping(Topping topping){
        String topping_name = topping.getName();
        super.add_topping(topping);
        switch(topping_name){
            case "lemon":
                hasLemonTopping = true;
                System.out.println("Lemon topping added!");
                break;
            case "kale":
                hasKaleTopping = true;
                System.out.println("Kale topping added!");
                break;
        }
    }

    @Override
    public double getTotalPrice(){
        double totalPrice = super.getTotalPrice();
        if(hasKaleTopping){
            KaleTopping kaleTopping = new KaleTopping();
            totalPrice += kaleTopping.getPrice();
        }
        if(hasLemonTopping){
            LemonTopping lemonTopping = new LemonTopping();
            totalPrice += lemonTopping.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void showPriceStructure(){
        super.showPriceStructure();
        if(hasKaleTopping){
            KaleTopping kaleTopping = new KaleTopping();
            System.out.println("Kale Topping: " + kaleTopping.getPrice());
        }
        if(hasLemonTopping){
            LemonTopping lemonTopping = new LemonTopping();
            System.out.println("Lemon Topping: " + lemonTopping.getPrice());
        }
    }
}

class DeluxeBurger extends Burger{
    public DeluxeBurger(String bread_type, String meat) {
        super("Deluxe Burger", 75, bread_type, meat);
        System.out.println("Preparing Deluxe Burger for you !");
    }

    @Override
    public void add_topping(Topping topping) {
        super.add_topping(topping);

        // Relay chips and drinks additions
        System.out.println("Chips added!");
        System.out.println("Drinks added!");
    }

    @Override
    public double getTotalPrice(){
        double totalPrice = super.getTotalPrice();

        // Adding chips
        ChipsTopping chipsTopping = new ChipsTopping();
        totalPrice += chipsTopping.getPrice();

        // Adding drinks
        DrinksTopping drinksTopping = new DrinksTopping();
        totalPrice += drinksTopping.getPrice();

        return totalPrice;
    }

    @Override
    public void showPriceStructure(){

        super.showPriceStructure();

        ChipsTopping chipsTopping = new ChipsTopping();
        System.out.println("Chips Topping: " + chipsTopping.getPrice());

        DrinksTopping drinksTopping = new DrinksTopping();
        System.out.println("Drinks Topping: " + drinksTopping.getPrice());
    }
}
