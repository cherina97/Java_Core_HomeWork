import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SupremeCouncil {

    private static SupremeCouncil instance = new SupremeCouncil();
    private SupremeCouncil() {
    }

    public static SupremeCouncil getInstance() {
        if (instance == null){
            instance = new SupremeCouncil();
        }
        return instance;
    }

    ArrayList<Faction> listOfFaction = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void addFaction(){
        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();

        Faction faction = new Faction(name);
        listOfFaction.add(faction);
        System.out.println("Фракція " + faction.getName() + " успішно додана до Верховної ради");
    }

    public void deleteFaction(){
        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();

        Iterator<Faction> iterator = listOfFaction.iterator();
        while (iterator.hasNext()){
            Faction nextFaction = iterator.next();
            if ( nextFaction.getName().equalsIgnoreCase(name))
            iterator.remove();
            System.out.println("Фракція " + nextFaction.getName() + " успішно видалена з Верховної ради");
        }
    }
    public void showAllFactions(){
        System.out.println("Список усіх фракцій Верховної ради: ");
        Iterator<Faction> iterator2 = listOfFaction.iterator();
        while (iterator2.hasNext()){
            Faction nextFaction = iterator2.next();
            System.out.println(nextFaction.getName());
        }
    }

    public void showFaction(){
        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();
        for (Faction faction : listOfFaction){
            if (faction.getName().equalsIgnoreCase(name)){
                faction.showAllDeputies();
            }
        }
    }
    public void addDeputyToTheFaction(){
        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();
        for (Faction faction : listOfFaction){
            if (faction.getName().equalsIgnoreCase(name)){
                faction.addDeputy();
            }
        }
    }
    public void deleteDeputyFromFaction(){
        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();
        for (Faction faction : listOfFaction){
            if (faction.getName().equalsIgnoreCase(name)){
                faction.removeDeputy();
            }
        }
    }
    public void deleteAllDeputyFromFaction(){
        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();
        for (Faction faction : listOfFaction){
            if (faction.getName().equalsIgnoreCase(name)){
                faction.deleteAllDeputies();
            }
        }
    }

    public void showAllBribeTakers(){
        for (Faction faction : listOfFaction){
            faction.showAllBribeTakers();
        }
    }
    public void theBiggestBribeTaker(){

        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();
        System.out.println("Найбільшим хабарником даної фракції є: ");
        for (Faction faction : listOfFaction){
            if (faction.getName().equalsIgnoreCase(name)){
                faction.theBiggestBribeTaker();
            }
        }
    }


}
