package house;

import computer.Dimensions;

public class Main {
    public static void main(String[] args) {
        Dimensions drawingRoomDimensions = new Dimensions(100, 80, 80);
        Dimensions bedroomDimensions = new Dimensions(80, 70, 65);
        Dimensions guestroomDimensions = new Dimensions(70, 60, 55);

        Furniture chair = new Furniture("Sofa", true);
        Furniture table = new Furniture("Center Table", true);
        Furniture tvUnit = new Furniture("TV Unit", false);
        DrawingRoom drawingRoom = new DrawingRoom("Living Room", drawingRoomDimensions, chair);
        BedRoom bedRoom = new BedRoom("Bed Room", bedroomDimensions, table);
        GuestRoom guestRoom = new GuestRoom("Guest Room", guestroomDimensions, tvUnit);

        drawingRoom.installTV();

        House house = new House("972 Valencia", "Richaman", drawingRoom, bedRoom, guestRoom);
        house.buildHouse();
    }
}
