import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Faction {

    private String name;

    public Faction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    ArrayList <Deputy> ListOfDeputy = new ArrayList<Deputy>();
    static Scanner scanner = new Scanner(System.in);
    public void addDeputy (){

        System.out.println("Введіть прізвище депутата");
        String surname = scanner.next();
        System.out.println("Введіть ім'я депутата");
        String name = scanner.next();
        System.out.println("Введіть вік депутата");
        int age = scanner.nextInt();
        System.out.println("Введіть вагу депутата");
        double weight = scanner.nextDouble();
        System.out.println("Введіть ріст депутата");
        int height = scanner.nextInt();
        System.out.println("Чи бере депутат хабарі? (true or false)");
        boolean briber = scanner.nextBoolean();

        Deputy deputy = new Deputy(weight, height, surname, name, age, briber);

        ListOfDeputy.add(deputy);
        System.out.println("Депутат " + deputy.toString() + " успішно доданий до фракції.");

        if (deputy.isBriber()){
            deputy.giveABribe();
        }

    }

    public void removeDeputy(){

        System.out.println("Введіть прізвище депутата");
        String surname = scanner.next();
        System.out.println("Введіть ім'я депутата");
        String name = scanner.next();

        Iterator <Deputy> iterator = ListOfDeputy.iterator();
        while (iterator.hasNext()){
            Deputy nextDeputy = iterator.next();
            if (nextDeputy.getSurname().equalsIgnoreCase(surname) && nextDeputy.getName().equalsIgnoreCase(name)){
                iterator.remove();
                System.out.println("Депутат " + nextDeputy.toString() + " успішно видалений з фракції.");
            }
        }

    }

    public void showAllBribeTakers(){
        for (Deputy deputy : ListOfDeputy){
            if (deputy.isBriber()){
                System.out.println("Депутат, який бере хабарь: " + deputy.toString());
            } else {
                System.out.println("Нема депутатів, які беруть хабарі");
            }
        }
    }

    public void theBiggestBribeTaker(){
        int bribeSize = 0;
        int indexOfDeputy = -1;

        for (int i = 0; i < ListOfDeputy.size() ; i++) {
            if (ListOfDeputy.get(i).isBriber()){
                if (ListOfDeputy.get(i).getValueOfTheBribe() > bribeSize){
                    bribeSize = ListOfDeputy.get(i).getValueOfTheBribe();
                    indexOfDeputy = ListOfDeputy.indexOf(ListOfDeputy.get(i));
                }
            }
        }
        if (indexOfDeputy >= -1) {
            System.out.println(ListOfDeputy.get(indexOfDeputy).getName());
        } else {
            System.out.println("В даній фракції хабарників нема");
        }


    }

    public void showAllDeputies (){
        Iterator <Deputy> iterator2 = ListOfDeputy.iterator();
        System.out.println("Всі депутати даної фракції: ");
        while (iterator2.hasNext()){
            Deputy nextDeputy = iterator2.next();
            System.out.println(nextDeputy);
        }
    }

    public void deleteAllDeputies (){
        ListOfDeputy.clear();
        System.out.println("Всіх депутатів успішно видалено з фракції");

    }

}
