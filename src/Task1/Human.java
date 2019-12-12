package Task1;

import java.util.Objects;

public class Human {

    private double weight;
    private  int height;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Human() {}

    public Human(double weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Double.compare(human.weight, weight) == 0 &&
                height == human.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height);
    }

    @Override
    public String toString() {
        return "Task1.Human{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}