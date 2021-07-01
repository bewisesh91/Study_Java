package chapter5;

public class Person {
    String name;
    int height;
    double weight;
    char gender;
    boolean married;
    int age;

    public Person() { }

    public Person(String pName) {
        name = pName;
    }

    public Person(String pName, int pHeight, float pWeight) {
        name = pName;
        height = pHeight;
        weight = pWeight;
    }
}
