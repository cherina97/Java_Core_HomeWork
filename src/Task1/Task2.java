package Task1;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {



        showMenu();
        System.out.println("Choose a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number != 5) {
            switch (number){
                case 1:
                    method1();
                    break;
                case 2:
                    method2();
                    break;
                case 3:
                    method3();
                    break;
                case 4:
                    method4();
                    break;
                case 5:
                    System.out.println("5");
                default:
                    System.out.println("Doesn`t exist");
            }
            showMenu();
            number = scanner.nextInt();
        }

    }


    static  int random = (int)((Math.random()*4) + 1);
    static  WheelMaterial [] wheelMaterial = WheelMaterial.values();

    private static void method1() {

        ArrayList <Auto> autoArrayList = new ArrayList<>();
        for (int i = 0; i < random; i++){
            autoArrayList.add (new Auto(randomValues(100,300), randomValues(1890,2019), new Wheel(randomValues(20,30), wheelMaterial[randomValues(0, wheelMaterial.length-1)].toString()), new Engine(randomValues(5,15))));
        }
        System.out.println(autoArrayList);
    }


    static int randomValues(int min, int max) {
        int result;
        return result = (int) ((Math.random() * (max - min) + 1) + min);

    }

    private static void method2() {
        ArrayList <Auto> autoArray2 = new ArrayList<>();
        Auto auto = new Auto(randomValues(100,300), randomValues(1890,2019), new Wheel(randomValues(20,30), wheelMaterial[randomValues(0, wheelMaterial.length-1)].toString()), new Engine(randomValues(5,15)));

        for (int i = 0; i < random ; i++) {
            autoArray2.add(auto);
        }
        System.out.println(autoArray2);
    }

    private static void method3() {
        ArrayList <Auto> autoArrayListCompare = new ArrayList<>();
        for (int i = 0; i < random; i++){
            autoArrayListCompare.add (new Auto(randomValues(100,300), randomValues(1890,2019), new Wheel(randomValues(20,30), wheelMaterial[randomValues(0, wheelMaterial.length-1)].toString()), new Engine(randomValues(5,15))));
        }

        Collections.sort (autoArrayListCompare, new IncreaseComparator());
        for (int i = 0; i < autoArrayListCompare.size(); i++) {
            System.out.println(autoArrayListCompare.get(i));
        }
    }
    private static void method4() {
        ArrayList <Auto> autoArrayListCompare2 = new ArrayList<>();
        for (int i = 0; i < random; i++){
            autoArrayListCompare2.add (new Auto(randomValues(100,300), randomValues(1890,2019), new Wheel(randomValues(20,30), wheelMaterial[randomValues(0, wheelMaterial.length-1)].toString()), new Engine(randomValues(5,15))));
        }

        Collections.sort (autoArrayListCompare2, new DecreaseComparator());
        for (int i = 0; i < autoArrayListCompare2.size(); i++) {
            System.out.println(autoArrayListCompare2.get(i));
        }
    }


    private static void showMenu() {
        System.out.println("Menu: ");
        System.out.println("\t1. Вивести рандомні авто");
        System.out.println("\t2. Заповнити масив одним рандомним авто");
        System.out.println("\t3. Відсортувати всі авто за зростанням кінських сил");
        System.out.println("\t4. Відсортувати всі авто за спаданням кінських сил");
        System.out.println("\t5. Вийти");
    }
}