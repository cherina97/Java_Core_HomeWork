package Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addString(list);
        System.out.println(list);
    }

    public static void addString(List list) {
        list.add("Some text");
    }
}
