import java.util.Scanner;

public class InputMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이가 어떻게 되시나요? ");
        int age = scanner.nextInt();
        System.out.println("나이는: " + age);

        System.out.println("이름이 어떻게 되시나요? ");
        String name = scanner.next();
        System.out.println(name + "의 나이는 " + age);
    }
}
