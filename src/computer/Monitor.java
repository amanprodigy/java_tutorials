package computer;

public class Monitor {
    private String model;
    private String manuf;
    private int size;
    private Resolution resolution;

    public Monitor(String model, String manuf, int size, Resolution resolution) {
        this.model = model;
        this.manuf = manuf;
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManuf() {
        return manuf;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
