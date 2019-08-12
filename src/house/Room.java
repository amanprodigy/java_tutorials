package house;

import computer.Dimensions;

public class Room {
    private String name;
    private Dimensions dimensions;
    private Furniture furniture;

    public Room(String name, Dimensions dimensions, Furniture furniture) {
        this.name = name;
        this.dimensions = dimensions;
        this.furniture = furniture;
    }

    public String getName() {
        return name;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
