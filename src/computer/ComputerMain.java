package computer;

public class ComputerMain {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 10, 5);
        Case theCase = new Case("3232", "Asus", "220", dimensions);
        Resolution resolution = new Resolution(2440, 1030);
        Monitor monitor = new Monitor("Intex 101", "Intex", 32, resolution);
        Motherboard motherboard = new Motherboard("XBC 11", "Intel", 3, 4, "TTW");
        PC pc = new PC(theCase, monitor, motherboard);
        pc.powerUP();
    }
}
