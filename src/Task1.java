import java.util.Scanner;

public class Task1 {
    static Scanner scan;
    public static void main(String[] args) {
        menu();
        System.out.println("Введіть необхідну цифру: ");
        scan = new Scanner(System.in);
        int choice = scan.nextInt();

        while ( choice != 11) {
            switch (choice){
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
                    method5();
                    break;
                case 6:
                    method6();
                    break;
                case 7:
                    method7();
                    break;
                case 8:
                    method8();
                    break;
                case 9:
                    method9();
                    break;
                case 10:
                    method10();
                    break;
                case 11:
                    System.out.println(11);
                    break;
                default:
                    System.out.println("Такого пункту меню не існує");
            }
            menu();
            choice = scan.nextInt();
        }
    }

    private static void method10() {
        System.out.println("Введіть місяць: ");
        String month = scan.next();
        for (Months months : Months.values()){
            boolean a = months.name().equalsIgnoreCase(month);
            if (a == true){
                if (months.getDays() %2 == 0){
                    System.out.println("Кількість днів в місяці є парною");
                } else {
                    System.out.println("Кількість днів в місяці є НЕпарною");
                }
            }
        }
    }

    private static void method9() {
        for (Months months : Months.values()){
            if (months.getDays()%2 != 0){
                System.out.println(months.name());
            }
        }
    }

    private static void method8() {
        for (Months months : Months.values()){
            if (months.getDays()%2 == 0){
                System.out.println(months.name());
            }
        }
    }

    private static void method7() {
        System.out.println("Введіть місяць: ");
        String month = scan.next();
        for (Months months : Months.values()){
            boolean a = months.name().equalsIgnoreCase(month);
            if (a == true){
                int seasons = months.getSeasons().ordinal();
                System.out.println(Seasons.values()[seasons - 1]);
                break;
            }
        }
    }


    private static void method6() {
        System.out.println("Введіть місяць: ");
        String month = scan.next();
        for (Months months : Months.values()){
            boolean a = months.name().equalsIgnoreCase(month);
            if (a == true){
                int seasons = months.getSeasons().ordinal();
                System.out.println(Seasons.values()[(seasons + 1)%4]);
                break;
            }
        }
    }

    private static void method5() {
        System.out.println("Введіть місяць: ");
        String month = scan.next();
        for (Months months : Months.values()){
            boolean a = months.name().equalsIgnoreCase(month);
            if (a == true){
                int day = months.getDays();
                for (Months months1 : Months.values()){
                    if (months1.getDays() > day){
                        System.out.println(months1.name());
                    } 
                }
            }
        }
    }

    private static void method4() {
        System.out.println("Введіть місяць: ");
        String month = scan.next();
        for (Months months : Months.values()){
            boolean a = months.name().equalsIgnoreCase(month);
            if (a == true){
                int day = months.getDays();
                for (Months months1 : Months.values()){
                    if (months1.getDays() < day){
                        System.out.println(months1.name());
                    }
                }
            }
        }
    }

    private static void method3() {
        System.out.println("Введіть місяць: ");
        String month = scan.next();
        for (Months months : Months.values()){
            boolean a = months.name().equalsIgnoreCase(month);
            if (a == true){
                int days = months.getDays();
                for (Months months1 : Months.values()){
                    if (months1.getDays() == days){
                        System.out.println(months1.name());
                    }
                }
            }
        }
    }

    private static void method2() {
        System.out.println("Введіть місяць: ");
        String month = scan.next();
        for (Months months : Months.values()){
            boolean a = months.name().equalsIgnoreCase(month);
            if (a == true) {
                Seasons seasons = months.getSeasons();
                for (Months months1 : Months.values()){
                    boolean a1 = months1.getSeasons().equals(seasons);
                    if (a1 == true) {
                        System.out.println(months1.name());
                    }
                }
            }
        }
    }

    private static void method1() {
        boolean monthFinded = true;
        System.out.println("Введіть місяць: ");
        String month = scan.next();
        for (Months months : Months.values()){
            if (months.name().equalsIgnoreCase(month)){
                System.out.println("Такий місяць існує");
                monthFinded = false;
            }
        }
        if (monthFinded != false){
            System.out.println("Такого місяця не існіє :( ");
        }
    }

    private static void menu() {
        System.out.println("Меню: ");
        System.out.println("\t 1. Перевірити, чи є такий місяць");
        System.out.println("\t 2. Вивести всі місяці з такою ж порою року");
        System.out.println("\t 3. Вивести всі місяці, які мають таку саму кількість днів");
        System.out.println("\t 4. Вивести всі місяці, які мають меншу кількість днів");
        System.out.println("\t 5. Вивести всі місяці, які мають більшу кількість днів");
        System.out.println("\t 6. Вивести наступну пору року");
        System.out.println("\t 7. Вивести попередню пору року");
        System.out.println("\t 8. Вивести всі місяці, які мають парну кількість днів");
        System.out.println("\t 9. Вивести всі місяці, які мають непарну кількість днів");
        System.out.println("\t 10. Перевірити, чи введений місяць має парну кількість днів ");
        System.out.println("\t 11. Вийти ");
    }
}
