package chapter2;

public class DoubleEx2 {
    public static void main(String[] args) {
        double dnum = 1;

        for (int i = 0; i < 10000; i++) {
            dnum += 0.1;
        }
        System.out.println(dnum);
        // 출력해보면 1001이 아니라 약간의 오차가 있다.
    }
}
