package max;

import java.util.*;

public class Main {

    static Set <Commodity> commoditySet = new HashSet<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
        System.out.println("Введіть потрібне число: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        while (choice !=10){
            switch (choice){
                case 1:
                    addCommodity();
                    break;
                case 2:
                    deleteCommodity();
                    break;
                case 3:
                    replaceCommodity();
                    break;
                case 4:
                    sortingByName();
                    break;
                case 5:
                    sortingByLength();
                    break;
                case 6:
                    sortingByWeight();
                    break;
                case 7:
                    sortingByWight();
                    break;
                case 8:
                    showCommodityNumberI();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Такого пункту меню не існує");

            }
            System.out.println("Введіть потрібне число: ");
            showMenu();
            choice = scanner.nextInt();
        }
    }

    private static void showCommodityNumberI() {
        ArrayList<Commodity> commodityArrayList = new ArrayList<>(commoditySet);
        System.out.println("Введіть id товару: ");
        int id = scanner.nextInt();

        if (id < 0 || id >= (commodityArrayList.size() - 1)){
            System.out.println("Товару з таким індексом нема");
        } else {
            System.out.println(commodityArrayList.get(id).toString());
        }

    }

    private static void sortingByWight() {
        Set <Commodity> commoditySetWight = new TreeSet<>(new WightComparator());
        commoditySetWight.addAll(commoditySet);

        for (Commodity commodity : commoditySetWight){
            System.out.println(commodity);
        }
    }

    private static void sortingByWeight() {
        Set <Commodity> commoditySetWeight = new TreeSet<>(new WeightComparator());
        commoditySetWeight.addAll(commoditySet);

        for (Commodity commodity : commoditySetWeight){
            System.out.println(commodity);
        }
    }

    private static void sortingByLength() {
        Set <Commodity> commoditySetLength = new TreeSet<>(new LengthComparator());
        commoditySetLength.addAll(commoditySet);

        for (Commodity commodity : commoditySetLength){
            System.out.println(commodity);
        }
    }

    private static void sortingByName() {
        Set <Commodity> commoditySetName = new TreeSet<>(new NameComparator());
        commoditySetName.addAll(commoditySet);

        for (Commodity commodity : commoditySetName){
            System.out.println(commodity);
        }
    }

    private static void replaceCommodity() {
        System.out.println("Введіть назву товару, який хочете замінити: ");
        String nameOfProduct = scanner.next();
        System.out.println("Введіть його довжину: ");
        int length = scanner.nextInt();
        System.out.println("Введіть його ширину: ");
        int weight = scanner.nextInt();
        System.out.println("Введіть його вагу: ");
        int wight = scanner.nextInt();

        for (Commodity commodity : commoditySet){
            if (commodity.getNameOfProduct().equalsIgnoreCase(nameOfProduct) &&
            commodity.getLength() == length &&
            commodity.getWeight() == weight &&
            commodity.getWight() == wight){
                System.out.println("Введіть нове ім'я товару: ");
                String newNameOfProduct = scanner.next();
                System.out.println("Введіть нову довжину: ");
                int newLength = scanner.nextInt();
                System.out.println("Введіть нову ширину: ");
                int newWeight = scanner.nextInt();
                System.out.println("Введіть нову вагу: ");
                int newWight = scanner.nextInt();
                commodity.setNameOfProduct(newNameOfProduct);
                commodity.setLength(newLength);
                commodity.setWeight(newWeight);
                commodity.setWight(newWight);
                commoditySet.add(commodity);

                System.out.println("Товар успішно замінений на " + commodity);
            }
        }
    }

    private static void deleteCommodity() {
        System.out.println("Введіть назву товару: ");
        String nameOfProduct = scanner.next();
        Iterator <Commodity> commodityIterator = commoditySet.iterator();
        while (commodityIterator.hasNext()){
            Commodity nextCommodity = commodityIterator.next();
            if (nextCommodity.getNameOfProduct().equalsIgnoreCase(nameOfProduct)){
                commodityIterator.remove();
                System.out.println("Продукт " + nextCommodity + " успішно видалений.");
            }
        }
    }

    private static void addCommodity() {
        System.out.println("Введіть назву товару: ");
        String nameOfProduct = scanner.next();
        System.out.println("Введіть довжину: ");
        int length = scanner.nextInt();
        System.out.println("Введіть ширину: ");
        int weight = scanner.nextInt();
        System.out.println("Введіть вагу: ");
        int wight = scanner.nextInt();

        Commodity commodity = new Commodity(nameOfProduct, length, weight, wight);
        commoditySet.add(commodity);
        System.out.println("Товар " + commodity + " успішно доданий.");
    }

    private static void showMenu() {
        System.out.println("Меню: ");
        System.out.println("\t1. Додати товар");
        System.out.println("\t2. Видалити товар");
        System.out.println("\t3. Замінити товар");
        System.out.println("\t4. Сортувати за назвою");
        System.out.println("\t5. Сортувати за довжиною");
        System.out.println("\t6. Сортувати за шириною");
        System.out.println("\t7. Сортувати за вагою");
        System.out.println("\t8. Вивести і-тий продукт");
        System.out.println("9.Вийти");
    }
}
