import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("문승현");
        nameList.add("승현");

        System.out.println(nameList.size());
        System.out.println(nameList);
    }
}
