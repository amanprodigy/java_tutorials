package printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(10, false);
        System.out.println("initial pages count " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println(
                "Pages printed was " + pagesPrinted +
                ". New total count of pages " + printer.getPagesPrinted()
        );
        pagesPrinted = printer.printPages(10);
        System.out.println(
                "Pages printed was " + pagesPrinted +
                        ". New total count of pages " + printer.getPagesPrinted()
        );
    }
}
