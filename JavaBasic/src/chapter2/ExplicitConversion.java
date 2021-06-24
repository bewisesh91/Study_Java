package chapter2;

public class ExplicitConversion {
    public static void main(String[] args) {
        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int iNum3 = (int)dNum1 + (int)fNum2;
        int iNum4 = (int)(dNum1 + fNum2);

        System.out.println(iNum3);
        System.out.println(iNum4);

        // 같은 값을 더하는 것처럼 보이지만 두 개의 연산 결과는 다르다.
    }
}
