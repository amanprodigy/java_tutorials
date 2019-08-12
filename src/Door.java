public class Door {
    protected String name;

    Door(){
        this.name = "Unnamed";
    }

    Door(String name){
        this.name = name;
    }

    public void open(){
        push();
    }

    public void push(){
        System.out.println(name + " pushed!");
    }
}

class BankDoor extends Door{

    BankDoor(String name){
        this.name = name;
    }

    public void open(){
        enterCombination();
        pull();
    }

    private void enterCombination(){
        System.out.println("Combination entered");
    }

    private void pull(){
        System.out.println("Door pulled!");
    }
}
