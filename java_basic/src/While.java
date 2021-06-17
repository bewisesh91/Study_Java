public class While {
    public static void main(String[] args) {
        int num = 10000;
        int key = 153;
        int count = 0;

        while (count*key <= num) {
            count++;
        }
        int result = (count - 1) * key;
        System.out.println(result);
    }
}
