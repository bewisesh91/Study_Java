package chapter5;

public class PersonTest {
    public static void main(String[] args) {
        Person personMun = new Person();
        personMun.name = "문승현";
        personMun.weight = 66.7;
        personMun.height = 178;

        Person personRyu = new Person("Ryu");

        Person personKim = new Person("김길동", 175, 70);
    }
}
