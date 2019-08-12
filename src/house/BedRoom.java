package house;

import computer.Dimensions;

public class BedRoom extends Room{
    private boolean hasBed;
    public BedRoom(String name, Dimensions dimensions, Furniture furniture) {
        super(name, dimensions, furniture);
        System.out.println(name + " is installed.");
    }

    public void installBed(){
        if(!hasBed){
            System.out.println("Bed is being installed in " + super.getName());
            hasBed = true;
        }
    }
}
