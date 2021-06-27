public class ClassMethod {
    static int count;
    public static void increment() {
        count++;
    }
    public static void main(String[] args) {
        System.out.println(ClassMethod.count);

        ClassMethod.increment();
        System.out.println(ClassMethod.count);

        ClassMethod.increment();
        System.out.println(ClassMethod.count);

        ClassMethod.increment();
        System.out.println(ClassMethod.count);
    }
}
