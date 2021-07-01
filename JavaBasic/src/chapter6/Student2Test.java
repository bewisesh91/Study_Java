package chapter6;

public class Student2Test {
    public static void main(String[] args) {
        Student2 studentMun = new Student2();
        studentMun.setStudentName("문승현");
        System.out.println(Student2.getSerialNum());

        Student2 studentRyu = new Student2();
        studentRyu.setStudentName("류건영");
        System.out.println(Student2.getSerialNum());
    }
}
