package burgers;

public class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Bills Burger !!!");
        Burger burger = new Burger("garlic bread", "chicken");
        TomatoTopping tomatoTopping = new TomatoTopping();
        OnionTopping onionTopping = new OnionTopping();
        LettuceTopping lettuceTopping = new LettuceTopping();
        OlivesTopping olivesTopping = new OlivesTopping();
        burger.add_topping(tomatoTopping);
        burger.add_topping(onionTopping);
        burger.add_topping(lettuceTopping);
        burger.add_topping(olivesTopping);
        burger.showPriceStructure();

        // Healthy Burger
        HealthyBurger healthyBurger = new HealthyBurger("lamb");
        LemonTopping lemonTopping = new LemonTopping();
        KaleTopping kaleTopping = new KaleTopping();
        healthyBurger.add_topping(lemonTopping);
        healthyBurger.add_topping(tomatoTopping);
        healthyBurger.add_topping(olivesTopping);
        healthyBurger.add_topping(kaleTopping);
        healthyBurger.showPriceStructure();

        // Deluxe Burger
        DeluxeBurger deluxeBurger = new DeluxeBurger("brown", "turkey");
        deluxeBurger.add_topping(tomatoTopping);
        deluxeBurger.add_topping(olivesTopping);
        deluxeBurger.showPriceStructure();
    }
}
