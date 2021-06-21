public class ShapePrinterMain2 {
    public static void main(String[] args) {
        ShapePrinter2 printer = new ShapePrinter2();

        // 테스트
        printer.printPyramid(3);
        System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
        printer.printPyramid(10);
    }
}
