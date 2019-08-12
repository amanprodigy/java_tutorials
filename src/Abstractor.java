abstract class Abstractor {
    private String actor;
    public abstract String getActor();

    Abstractor(){
        this.actor = "Aman";
    }
}

class Star extends Abstractor{
    private String actor;
    Star(){
        this.actor = "Dropbox";
    }
    public String getActor(){
        return this.actor;
    }
}
