public class Operators {
    public static void main(String[] args) {
        String myString = "Hello " + "Seung Hyun!";
        System.out.println(myString);

        System.out.println("숫자 연산자 : 정수형");
        int a = 9;
        int b = 5;
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));

        System.out.println("숫자 연산자 : 소수형");
        int c = 9;
        double d = 5;
        System.out.println(c + " + " + d + " = " + (c + d));
        System.out.println(c + " - " + d + " = " + (c - d));
        System.out.println(c + " * " + d + " = " + (c * d));
        System.out.println(c + " / " + d + " = " + (c / d));
        System.out.println(c + " % " + d + " = " + (c % d));

        System.out.println("비교 연산자");
        System.out.println(3 + " > " + 2 + " : " + (3 > 2));
        System.out.println(3 + " < " + 2 + " : " + (3 < 2));
        System.out.println(3 + " >= " + 2 + " : " + (3 >= 2));
        System.out.println(3 + " <= " + 2 + " : " + (3 <= 2));
        System.out.println(3 + " == " + 2 + " : " + (3 == 2));
        System.out.println(3 + " != " + 2 + " : " + (3 != 2));

        System.out.println("불린 연산자 : and ");
        System.out.println("true && true : " + (true && true));
        System.out.println("true && false : " + (true && false));
        System.out.println("false && ture : " + (false && true));
        System.out.println("false && false : " + (false && false));

        System.out.println("불린 연산자 : or ");
        System.out.println("true || true : " + (true || true));
        System.out.println("true || false : " + (true || false));
        System.out.println("false || ture : " + (false || true));
        System.out.println("false || false : " + (false || false));

        System.out.println("불린 연산자 : not ");
        System.out.println("!true : " + !true);
        System.out.println("!false : " + !false);
    }
}
