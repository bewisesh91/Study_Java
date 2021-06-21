public class ShaplePrinterMain3 {
    public static void main(String[] args) {
        ShapePrinter3 printer = new ShapePrinter3();

        // 테스트
        printer.printFloydsPyramid(3);
        System.out.println("----------");
        printer.printFloydsPyramid(5);
        System.out.println("----------");
        printer.printFloydsPyramid(15);
    }
}
