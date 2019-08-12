package computer;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public void powerUP(){
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        theMonitor.drawPixelAt(1200, 50, "green");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getTheMonitor() {
        return theMonitor;
    }

    private Motherboard getTheMotherboard() {
        return theMotherboard;
    }

}
