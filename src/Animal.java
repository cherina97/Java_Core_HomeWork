import java.lang.reflect.AnnotatedArrayType;
import java.util.Objects;

public class Animal {

    private String typeOfAnimal;
    private String nick;

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Animal(String typeOfAnimal, String nick) {
        this.typeOfAnimal = typeOfAnimal;
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "typeOfAnimal='" + typeOfAnimal + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Animal animal = (Animal) obj;
        return Objects.equals(typeOfAnimal, animal.typeOfAnimal) && Objects.equals(nick, animal.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfAnimal, nick);
    }
}
