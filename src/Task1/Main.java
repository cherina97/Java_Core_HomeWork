package Task1;

public class Main {
    public static void main(String[] args) {

        Pet cow = type -> System.out.println("I am " + type + " - Muu - muu!");
        cow.voice("cow");

        Pet cat = type -> System.out.println("I am " + type + " - Meow - meow!");
        cat.voice("cat");

        Pet dog = type -> System.out.println("I am " + type + " - Rah - rah!");
        dog.voice("dog");
    }
}
