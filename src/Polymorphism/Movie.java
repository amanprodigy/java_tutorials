package Polymorphism;

public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "Shark attack on the beach";
    }
}

class Hero extends Movie{
    public Hero(){
        super("Hero");
    }
}

class Braveheart extends Movie{
    public Braveheart(){
        super("Braveheart");
    }

    public String plot(){
        return "A solo warrior trumps an empire";
    }
}

class Matrix extends Movie{
    public Matrix(){
        super("Matrix");
    }

    public String plot(){
        return "A computer programmer finds the real world eerie.";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable");
    }
}

class Main{
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie # " + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n"
            );
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new Hero();
            case 3:
                return new Matrix();
            case 4:
                return new Braveheart();
            case 5:
                return new Forgettable();
        }
        return null;
    }
}
