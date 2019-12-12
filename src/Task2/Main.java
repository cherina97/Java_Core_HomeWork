package Task2;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier <Integer> showMenu = () -> {
            System.out.println("Меню: ");
            System.out.println("\t1. Додати учасника клубу");
            System.out.println("\t2. Додати тваринку до учасника клубу");
            System.out.println("\t3. Видалити тваринку з учасника клубу");
            System.out.println("\t4. Видалити учасника з клубу");
            System.out.println("\t5. Видалити конкретнку тваринку зі всіх власників");
            System.out.println("\t6. Вивести на екран зооклуб");
            System.out.println("7.Вийти");

            System.out.println("Введіть потрібне число: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            return choice;
        };

        ZooClub zooClub = new ZooClub();

        while (true){
            switch (showMenu.get()){
                case 1:
                    zooClub.addMember();
                    break;
                case 2:
                    zooClub.addAnimalToMember();
                    break;
                case 3:
                    zooClub.deleteAnimalFromMember();
                    break;
                case 4:
                    zooClub.deleteMember();
                    break;
                case 5:
                    zooClub.deleteThisAnimal();
                    break;
                case 6:
                    zooClub.showZooClub();
                    break;
                default:
                    System.exit(0);

            }
        }
    }
}
