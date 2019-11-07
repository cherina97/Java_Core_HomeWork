import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

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
//                case 3:
//                    System.out.println("3");
//                    break;
//                case 4:
//                    System.out.println("4");
//                    break;
                case 5:
                    System.out.println("5");
                default:
                    System.out.println("Doesn`t exist");
            }
            showMenu();
            number = scanner.nextInt();
        }



    }

    static  int random = (int)((Math.random()*3) + 1);
    static  WheelMaterial [] wheelMaterial = WheelMaterial.values();

    private static void method1() {

        Auto [][] autoArray = new Auto[random][random];
        for (int i = 0; i < autoArray.length; i++){
            for (int j = 0; j < autoArray[i].length; j++){
                autoArray[i][j] = new Auto(randomValues(100,300), randomValues(1890,2019), new Wheel(randomValues(20,30), wheelMaterial[randomValues(0, wheelMaterial.length-1)].toString()), new Engine(randomValues(5,15)));
            }
        }
        System.out.println(Arrays.deepToString(autoArray));
    }


    static int randomValues(int min, int max) {
        int result;
        return result = (int) ((Math.random() * (max - min)) + min);

    }

    private static void method2() {
        Auto [] autoArray2 = new Auto[random];
        Auto auto = new Auto(randomValues(100,300), randomValues(1890,2019), new Wheel(randomValues(20,30), wheelMaterial[randomValues(0, wheelMaterial.length-1)].toString()), new Engine(randomValues(5,15)));

        Arrays.fill ( autoArray2, auto);
        System.out.println(Arrays.deepToString(autoArray2));

    }


    private static void showMenu() {
        System.out.println("Menu: ");
        System.out.println("\t1. Вивести рандомні авто");
        System.out.println("\t2. Заповнити масив одним рандомним авто");
//        System.out.println("\t3. Відсортувати всі об'єкти за введеним полем за зростанням");
//        System.out.println("\t4. Відсортувати всі об'єкти за введеним полем за спаданням");
        System.out.println("\t5. Вийти");
    }
}
