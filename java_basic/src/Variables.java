public class Variables {
    public static void main(String[] args) {
        // 변수의 선언 : type variableName;
        // int <- 자료형, age <- 변수의 이름

        boolean myBoolean;
        myBoolean = true;

        int myInt;
        myInt = 27;

        // 숫자가 너무 커질 경우 long 자료형 이용
        long myLong;
        myLong = 12345678910L;

        double myDouble;
        myDouble = 3.14;

        String myString;
        myString = "Seung Hyun";

        System.out.println(myBoolean);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myString);
    }
}
