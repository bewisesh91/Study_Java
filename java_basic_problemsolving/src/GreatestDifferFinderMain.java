public class GreatestDifferFinderMain {
    public static void main(String[] args) {
        GreatestDifferFinder finder = new GreatestDifferFinder();
        // 테스트 1
        int[] testArray1 = {-2, 7, 3};
        System.out.println(finder.greatestDiffer(testArray1));

        // 테스트 2
        int[] testArray2 = {8, 3, 14, 1};
        System.out.println(finder.greatestDiffer(testArray2));

        // 테스트 3
        int[] testArray3 = {4, 2, 3, 1};
        System.out.println(finder.greatestDiffer(testArray3));

        // 테스트 4
        int[] testArray4 = {};
        System.out.println(finder.greatestDiffer(testArray4));

        // 테스트 5
        int[] testArray5 = {1, 2, -3, 4, 5};
        System.out.println(finder.greatestDiffer(testArray5));

        // 테스트 6
        int[] testArray6 = {1};
        System.out.println(finder.greatestDiffer(testArray6));
    }
}
