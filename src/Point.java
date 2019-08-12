public class Point {
    private int x;
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(){
        this(0, 0);
    }

    public Point center(Point other){
        // Returns the center between the point and the
        // Other point
        return new Point(
                (x + other.x) / 2,
                (y + other.y) / 2
        );
    }

    public void printPoint(){
        System.out.println("("+x+","+y+")");
    }

}
