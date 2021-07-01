package chapter6;

public class StudentTest {
    public static void main(String[] args) {
        Student studentMun = new Student();
        studentMun.setStudentName("문승현");
        System.out.println(studentMun.serialNum);
        System.out.println(Student.serialNum);
    }
}
