public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new Map<>(2, 5);
        map.addNewElement(7,3);
        map.addNewElement(1, 0);
        map.addNewElement(5, 8);
        map.showAllMap();
        System.out.println("Set of key: ");
        map.showSetOfKey();
        System.out.println("List of value: ");
        map.showListOfValue();

        System.out.println();
        map.deleteByKey(7);
        map.showAllMap();

        System.out.println();
        map.deleteByValue(0);
        map.showAllMap();
    }
}
