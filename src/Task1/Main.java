package Task1;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier <Integer> showMenu = () -> {
            System.out.println("Меню: ");
            System.out.println("\t1. Додати фракцію");
            System.out.println("\t2. Видалити конкретну фракцію");
            System.out.println("\t3. Вивести усі фракції");
            System.out.println("\t4. Очистити конкретну фракцію");
            System.out.println("\t5. Вивести конкретну фракцію");
            System.out.println("\t6. Додати депутата у фракцію");
            System.out.println("\t7. Видалити депутата з фракції");
            System.out.println("\t8. Вивести список хабарників");
            System.out.println("\t9. Вивести найбільшого хабарника");
            System.out.println("10.Вийти");

            System.out.println("Введіть потрібне число: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            return choice;
        };

        while (true){
            switch (showMenu.get()){
                case 1:
                    SupremeCouncil.getInstance().addFaction();
                    break;
                case 2:
                    SupremeCouncil.getInstance().deleteFaction();
                    break;
                case 3:
                    SupremeCouncil.getInstance().showAllFactions();
                    break;
                case 4:
                    SupremeCouncil.getInstance().deleteAllDeputyFromFaction();
                    break;
                case 5:
                    SupremeCouncil.getInstance().showFaction();
                    break;
                case 6:
                    SupremeCouncil.getInstance().addDeputyToTheFaction();
                    break;
                case 7:
                    SupremeCouncil.getInstance().deleteDeputyFromFaction();
                    break;
                case 8:
                    SupremeCouncil.getInstance().showAllBribeTakers();
                    break;
                case 9:
                    SupremeCouncil.getInstance().theBiggestBribeTaker();
                    break;
                default:
                    System.exit(0);

            }
        }
    }
}