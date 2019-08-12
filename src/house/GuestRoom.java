package house;

import computer.Dimensions;

public class GuestRoom extends Room{
    private boolean hasBed;
    private boolean hasAttachedWashroom;
    public GuestRoom(String name, Dimensions dimensions, Furniture furniture) {
        super(name, dimensions, furniture);

        System.out.println("Built " + name);
    }

    public void installBed(){
        if(!hasBed){
            System.out.println("Bed is being installed in " + super.getName());
            hasBed = true;
        }
    }
}
