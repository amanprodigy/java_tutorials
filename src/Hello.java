public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        int[] arr = {2, 4, 3, 1, 0, -1};
        for (int elem : arr) {
            System.out.println((int) Math.pow(elem, 2));
        }

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
        // while loop ends

        // Student example
        Student aman = new Student();
        aman.setName("Aman");
        Student richa = new Student();
        richa.setName("Richa");
        System.out.println(aman.getName());
        System.out.println(richa.getName());

        // Point example
        Point p1 = new Point(3, 4);
        Point p2 = new Point(7, 6);

        p1.printPoint();
        p2.printPoint();
        Point p3 = p1.center(p2);
        p3.printPoint();


        // Door example
        Door normal = new Door("Simple");
        Door bankDoor = new BankDoor("HDFC Gate");
        normal.open();
        bankDoor.open();

        // Abstract class example
        Abstractor abs = new Star();
        String actor = abs.getActor();
        System.out.println(actor);

        // Interface example
        Car audi = new Car("Audi");
        audi.setSpecs(800, 250);
        System.out.println(audi.move());
        double momentum = audi.getMomentum();
        System.out.println(audi.getName() + " is moving with " + momentum + " kg.m/s");

        // Inheritance challenge

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius " + circle.getRadius());
        System.out.println("circle.area " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius = " + cylinder.getRadius());
        System.out.println("cylinder.height = " + cylinder.getHeight());
        System.out.println("cylinder.area = " + cylinder.getArea());
        System.out.println("cylinder.volume = " + cylinder.getVolume());

    }
}
