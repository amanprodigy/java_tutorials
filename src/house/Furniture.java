package house;

public class Furniture {
    private String name;
    private boolean isWooden;

    public Furniture(String name, boolean isWooden) {
        this.name = name;
        this.isWooden = isWooden;
    }

    public String getName() {
        return name;
    }

    public boolean isWooden() {
        return isWooden;
    }
}
