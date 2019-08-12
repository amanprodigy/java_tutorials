package house;

import computer.Dimensions;

public class DrawingRoom extends Room{
    private boolean hasTV;
    public DrawingRoom(String name, Dimensions dimensions, Furniture furniture) {
        super(name, dimensions, furniture);
        System.out.println( name + " is installed.");
    }

    public void installTV(){
        if(!hasTV){
            System.out.println("TV is being installed in " + super.getName());
            hasTV = true;
        }
    }
}
