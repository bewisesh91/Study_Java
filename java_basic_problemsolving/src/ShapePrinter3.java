public class ShapePrinter3 {
    public void printFloydsPyramid(int height) {
        int length = String.valueOf(height * (height + 1) / 2).length();
        int number = 1;

        for (int row = 1; row <= height; row++) {
            String result = "";

            for (int col = 1; col <= row; col++) {
                for (int i = String.valueOf(number).length(); i < length; i++) {
                    result += " ";
                }

                result += (number + " ");
                number++;
            }
            System.out.println(result);
        }
    }
}
