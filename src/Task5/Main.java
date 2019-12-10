package Task5;

public class Main {
    public static void main(String[] args) {
        Amphibious eat = () -> System.out.println("Amphibious is eating!");
        eat.doSomething();

        Amphibious sleep = () -> System.out.println("Amphibious is sleeping!");
        sleep.doSomething();

        Amphibious swim = () -> System.out.println("Amphibious is swimming!");
        swim.doSomething();

        Amphibious walk = () -> System.out.println("Amphibious is walking!");
        walk.doSomething();

    }
}
