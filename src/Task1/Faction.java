package Task1;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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

    Supplier<Deputy> createNewDeputy = () -> {
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

        return new Deputy(weight, height, surname, name, age, briber);
    };

    Supplier<Deputy> chooseTheDeputy = () -> {
        System.out.println("Введіть прізвище депутата");
        String surname = scanner.next();
        System.out.println("Введіть ім'я депутата");
        String name = scanner.next();

        return new Deputy(surname, name);
    };

    public void addDeputy (){
        Deputy deputy = createNewDeputy.get();
        if (deputy.isBriber()){
            deputy.giveABribe();
        }
        ListOfDeputy.add(deputy);
        System.out.println("Депутат " + deputy.toString() + " успішно доданий до фракції.");
    }

    public void removeDeputy(){
        Deputy deputy = chooseTheDeputy.get();
        Predicate <Deputy> isNameSurnameEquals = deputy1 -> deputy.getSurname().equalsIgnoreCase(deputy1.getSurname())
                &&deputy.getName().equalsIgnoreCase(deputy1.getName());
        Optional <Deputy> deputyIsPresent = ListOfDeputy.stream().findFirst().filter(isNameSurnameEquals);

        if(deputyIsPresent.isPresent()){
            ListOfDeputy.remove(deputyIsPresent.get());
            System.out.println("Task1.Deputy " + deputyIsPresent.get().toString() + " was successfully deleted from the faction.");
        } else {
            System.out.println("Such deputy doesn't exist.");
        }
    }

    public void showAllBribeTakers(){
        System.out.println("Deputies, who takes a bribe: ");
        List<Deputy> collect = ListOfDeputy.stream().filter(Deputy::isBriber).collect(Collectors.toList());
        System.out.println(collect);
    }

    public void theBiggestBribeTaker(){
        Comparator<Deputy> compareABribe = (deputy1, deputy2) -> (deputy1.getValueOfTheBribe() > deputy2.getValueOfTheBribe()) ? 1
                : (deputy1.getValueOfTheBribe() == deputy2.getValueOfTheBribe()) ? 0
                : -1;
        Optional <Deputy> theBiggestBribeTaker = ListOfDeputy.stream().max(compareABribe).filter(Deputy::isBriber);
        if(theBiggestBribeTaker.isPresent()){
            System.out.println("Task1.Deputy " + theBiggestBribeTaker.get().toString() + " is the biggest bribe taker.");
        } else {
            System.out.println("Nobody doesn't takes a bribe.");
        }
    }

    public void showAllDeputies (){
        System.out.println("List of all deputies: ");
        ListOfDeputy.stream().forEach(System.out::println);
    }

    public void deleteAllDeputies (){
        ListOfDeputy.clear();
        System.out.println("Всіх депутатів успішно видалено з фракції");
    }

    @Override
    public String toString() {
        return "Task1.Faction{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faction faction = (Faction) o;
        return Objects.equals(name, faction.name) &&
                Objects.equals(ListOfDeputy, faction.ListOfDeputy) &&
                Objects.equals(createNewDeputy, faction.createNewDeputy) &&
                Objects.equals(chooseTheDeputy, faction.chooseTheDeputy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ListOfDeputy, createNewDeputy, chooseTheDeputy);
    }
}