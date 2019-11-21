import java.util.Objects;

public class Animal {

    private String typeOfAnimal;
    public int speed;
    public int wight;

    public Animal() {
    }

    public Animal(String typeOfAnimal, int speed) {
        this.typeOfAnimal = typeOfAnimal;
        this.speed = speed;
    }

    public Animal(String typeOfAnimal, int speed, int wight) {
        this.typeOfAnimal = typeOfAnimal;
        this.speed = speed;
        this.wight = wight;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "typeOfAnimal='" + typeOfAnimal + '\'' +
                ", speed=" + speed +
                ", wight=" + wight +
                '}';
    }
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return speed == animal.speed &&
                Objects.equals(typeOfAnimal, animal.typeOfAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfAnimal, speed);
    }

    public void setNick (String nick, int age){
        System.out.println("Тваринка має кличку " + nick + ", їй " + age + " років.");
    }
}
