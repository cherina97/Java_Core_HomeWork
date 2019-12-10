package Task4;

public class Main {

    private int speed;
    private String typeOgAnimal;
    private boolean isWild;

    public Main() {
    }

    public Main(int speed, String typeOgAnimal) {
        this.speed = speed;
        this.typeOgAnimal = typeOgAnimal;
    }

    public Main(int speed, String typeOgAnimal, boolean isWild) {
        this (speed, typeOgAnimal);
        this.isWild = isWild;
    }

    public static void main(String[] args) {
        Animal animal = Main::new;
        Main main = animal.createNewAnimal(20, "Cat", false);
        System.out.println();
    }
}

@FunctionalInterface
interface Animal{
    Main createNewAnimal(int speed, String typeOgAnimal, boolean isWild);
}
