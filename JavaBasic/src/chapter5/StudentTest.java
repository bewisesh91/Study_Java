package chapter5;

public class StudentTest {
    public static void main(String[] args) {
        Student studentMun = new Student();
        studentMun.setStudentName("문승현");
        System.out.println(studentMun.getStudentName());

        Student studentRyu = new Student();
        studentRyu.setStudentName("류건영");
        System.out.println(studentRyu.getStudentName());
    }
}
