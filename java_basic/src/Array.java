public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 11;

        // int[] intArray = {1, 2, 3, 4, 5}; 이런 방식으로도 가능

       for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        String[] fruitsArray = new String[5];

        fruitsArray[0] = "딸기";
        fruitsArray[1] = "당근";
        fruitsArray[2] = "수박";
        fruitsArray[3] = "참외";
        fruitsArray[4] = "메론";

        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }

        int[] intArray2 = new int[30];
        for (int i = 0; i < intArray2.length; i++) {
            intArray2[i] = 1001 + i;
        }
        String[] remainders = {"Zero", "One", "Two", "Three"};
        for (int i : intArray2) {
            System.out.println(remainders[i%4]);
        }
    }
}
