package Task2;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ZooClub {

    Map<Person, ArrayList<Animal>> mapZooClub = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    Supplier <Person> member = () -> {
        System.out.println("Введіть ім'я учасника : ");
        String name = scanner.next();
        System.out.println("Введіть вік учасника : ");
        int age = scanner.nextInt();
        return new Person(name, age);
    };

    Supplier <Animal> animal = () -> {
        System.out.println("Введіть тип тваринки : ");
        String typeOfAnimal = scanner.next();
        System.out.println("Введіть кличку тваринки : ");
        String nick = scanner.next();
        return new Animal(typeOfAnimal, nick);
    };

    public void addMember(){
        Person person = member.get();
        mapZooClub.put(person, new ArrayList<Animal>());
        System.out.println("Новий учасник " + person.toString() + " успішно доданий до клубу.");
    }

    public void addAnimalToMember(){
        Person person = member.get();
        Animal animal = this.animal.get();
        mapZooClub.get(person).add(animal);
        System.out.println("Animal " + animal.toString() + " successfully added to " + person.toString());

    }

    public void deleteAnimalFromMember(){
        Person person = member.get();
        Animal animal = this.animal.get();
        mapZooClub.get(person).remove(animal);
        System.out.println("Animal " + animal.toString() + " successfully removed from " + person.toString());
    }

    public void deleteMember(){
        Person person = member.get();
        mapZooClub.remove(person, new ArrayList<Animal>());
        System.out.println("Учасник " + person.toString() + " успішно видалений к клубу.");
    }

    public void deleteThisAnimal(){
        Animal animal = this.animal.get();
        Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = mapZooClub.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Person, ArrayList<Animal>> next = iterator.next();
            next.getValue().remove(animal);
            System.out.println("Animal  " + animal.toString() + "  successfully removed from all members.");
        }
    }

    public void showZooClub(){
        System.out.println("List of ZooClub: ");
        mapZooClub.entrySet().stream().forEach(System.out::println);
    }
}