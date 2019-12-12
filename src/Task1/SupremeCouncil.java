package Task1;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

    Supplier<Faction> factionSupplier = () -> {
        System.out.println("Введіть назву фракції: ");
        String name = scanner.next();
        return new Faction(name.toString());
    };

    public Optional<Faction> factionIsPresent(){
        Faction faction = factionSupplier.get();

        Predicate <Faction> isNameEquals  = (faction1 -> faction1.getName().equalsIgnoreCase(faction.getName()));
        Optional <Faction> factionIsPresent = listOfFaction.stream().filter(isNameEquals).findFirst();

        return factionIsPresent;
    }


    public void addFaction(){
        Faction faction = factionSupplier.get();
        listOfFaction.add(faction);
        System.out.println("Фракція " + faction.getName() + " успішно додана до Верховної ради");
    }

    public void deleteFaction(){
        Optional<Faction> factionIsPresent = factionIsPresent();
        if (factionIsPresent.isPresent()){
            listOfFaction.remove(factionIsPresent.get());
            System.out.println("Task1.Faction " + factionIsPresent.get().toString() + " was successfully deleted from the Supreme Council.");
        } else {
            System.out.println("Such faction doesn't exist.");
        }
    }

    public void showAllFactions(){
        System.out.println("List of all factions in Supreme Council: ");
        listOfFaction.stream().forEach(System.out::println);
    }

    public void showFaction(){
        Optional<Faction> faction = factionIsPresent();
        if(faction.isPresent()){
            faction.get().showAllDeputies();
        } else {
            System.out.println("Such faction doesn't exist.");
        }
    }

    public void addDeputyToTheFaction(){
        Optional<Faction> faction = factionIsPresent();
        if(faction.isPresent()){
            faction.get().addDeputy();
        } else {
            System.out.println("Such faction doesn't exist.");
        }
    }

    public void deleteDeputyFromFaction(){
        Optional<Faction> faction = factionIsPresent();
        if(faction.isPresent()){
            faction.get().removeDeputy();
        } else {
            System.out.println("Such faction doesn't exist.");
        }
    }

    public void deleteAllDeputyFromFaction(){
        Optional<Faction> faction = factionIsPresent();
        if(faction.isPresent()){
            faction.get().deleteAllDeputies();
        } else {
            System.out.println("Such faction doesn't exist.");
        }
    }

    public void showAllBribeTakers(){
        Optional<Faction> faction = factionIsPresent();
        if(faction.isPresent()){
            faction.get().showAllBribeTakers();
        } else {
            System.out.println("Such faction doesn't exist.");
        }
    }

    public void theBiggestBribeTaker(){
        Optional<Faction> faction = factionIsPresent();
        if(faction.isPresent()){
            faction.get().theBiggestBribeTaker();
        } else {
            System.out.println("Such faction doesn't exist.");
        }
    }
}