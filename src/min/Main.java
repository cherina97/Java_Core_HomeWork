package min;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set <Animal> animals = new HashSet<>();
        animals.add(new Animal("Cat", 20));
        animals.add (new Animal("Mouse", 15));
        animals.add( new Animal("Crocodile", 5));
        animals.add ( new Animal("Tiger", 100));

        System.out.println("\tНевідсортований список: ");
        for (Animal an : animals) {
            System.out.println(an);
        }
        System.out.println();

        Set <Animal> animals1 = new TreeSet<>(new SpeedComparator());
        animals1.add(new Animal("Cat", 20));
        animals1.add (new Animal("Mouse", 15));
        animals1.add( new Animal("Crocodile", 5));
        animals1.add ( new Animal("Tiger", 100));

        System.out.println("\tСортування за допомогою Comparator за збільшення швидкості: ");
        for (Animal an : animals1) {
            System.out.println(an);
        }
        System.out.println();

        Set <Animal> animals3 = new TreeSet<>();
        animals3.add(new Animal("Cat", 20));
        animals3.add (new Animal("Mouse", 15));
        animals3.add( new Animal("Crocodile", 5));
        animals3.add ( new Animal("Tiger", 100));

        System.out.println("\tСортування за допомогою Comparable: ");
        for (Animal an : animals3) {
            System.out.println(an);
        }

    }
}
