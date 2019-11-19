import java.util.*;

public class ZooClub {

    Map<Person, ArrayList<Animal>> mapZooClub = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public void addMember(){
        System.out.println("Введіть ім'я учасника : ");
        String name = scanner.next();
        System.out.println("Введіть вік учасника : ");
        int age = scanner.nextInt();
        Person person = new Person(name, age);

        mapZooClub.put(person, new ArrayList<Animal>());
        System.out.println("Новий учасник " + person + " успішно доданий до клубу.");
    }

    public void addAnimalToMember(){
        System.out.println("Введіть ім'я учасника, до якого хочете додати тваринку: ");
        String name = scanner.next();
        System.out.println("Введіть вік учасника : ");
        int age = scanner.nextInt();
        Person person = new Person(name, age);

        if (mapZooClub.containsKey(person)){
            System.out.println("Введіть тип тваринки : ");
            String typeOfAnimal = scanner.next();
            System.out.println("Введіть кличку тваринки : ");
            String nick = scanner.next();
            Animal animal = new Animal(typeOfAnimal, nick);
            mapZooClub.get(person).add(animal);
            System.out.println("Тваринка " + animal + " успішно додана до учасника клубу " + person);
        } else
            System.out.println("Такого учасника в клубі не зареєстровано");
    }

    public void deleteAnimalFromMember(){
        System.out.println("Введіть ім'я учасника, з якого хочете видалити тваринку: ");
        String name = scanner.next();
        System.out.println("Введіть вік учасника : ");
        int age = scanner.nextInt();
        Person person = new Person(name, age);

        if (mapZooClub.containsKey(person)){
            System.out.println("Введіть тип тваринки : ");
            String typeOfAnimal = scanner.next();
            System.out.println("Введіть кличку тваринки : ");
            String nick = scanner.next();
            Animal animal = new Animal(typeOfAnimal, nick);
            mapZooClub.get(person).remove(animal);
            System.out.println("Тваринка " + animal + " успішно видалена від учасника клубу " + person);
        }
    }

    public void deleteMember(){
        System.out.println("Введіть ім'я учасника клубу, якого хочете видалити: ");
        String name = scanner.next();
        System.out.println("Введіть вік учасника : ");
        int age = scanner.nextInt();
        Person person = new Person(name, age);

        if (mapZooClub.containsKey(person)){
            mapZooClub.remove(person);
            System.out.println("Учасник " + person + " успішно видалений з клубу.");
        }
    }

    public void deleteThisAnimal(){
        System.out.println("Введіть тип тваринки, яку хочете видалити : ");
        String typeOfAnimal = scanner.next();
        System.out.println("Введіть кличку тваринки, яку хочете видалити  : ");
        String nick = scanner.next();
        Animal animal = new Animal(typeOfAnimal, nick);

        Set<Map.Entry<Person, ArrayList<Animal>>> entries2 = mapZooClub.entrySet();
        Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator2 = entries2.iterator();

        while (iterator2.hasNext()){
            Map.Entry<Person, ArrayList<Animal>> next = iterator2.next();
            next.getValue().remove(animal);
            System.out.println("Тваринка " + animal + " видалена у " + next.getKey());
        }
    }

    public void showZooClub(){
        Set<Map.Entry<Person, ArrayList<Animal>>> entries = mapZooClub.entrySet();
        Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = entries.iterator();

        while (iterator.hasNext()){
            Map.Entry<Person, ArrayList<Animal>> next = iterator.next();
            System.out.println(next.getKey() + " - " + next.getValue());
        }
    }
}
