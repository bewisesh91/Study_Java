package chapter7;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArray = {"Java", "Android", "C", "Javascript", "Python"};

        for(String language : strArray) {
            System.out.println(language);
        }
    }
}
