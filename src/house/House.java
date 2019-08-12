package house;

public class House {
    private String address;
    private String name;
    private DrawingRoom drawingRoom;
    private BedRoom bedRoom;
    private GuestRoom guestRoom;

    public House(String address, String name, DrawingRoom drawingRoom, BedRoom bedRoom, GuestRoom guestRoom) {
        this.address = address;
        this.name = name;
        this.drawingRoom = drawingRoom;
        this.bedRoom = bedRoom;
        this.guestRoom = guestRoom;
    }

    public void buildHouse(){
        drawingRoom.installTV();
        bedRoom.installBed();
        guestRoom.installBed();
    }

}
