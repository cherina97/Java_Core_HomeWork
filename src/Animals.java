public class Animals {
    @MyAnnotation("The type of animal")
    String typeOfAnimal;
    int speed;
    @MyAnnotation("The weight of this animal")
    int weight;

    public Animals(String typeOfAnimal, int speed, int weight) {
        this.typeOfAnimal = typeOfAnimal;
        this.speed = speed;
        this.weight = weight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "typeOfAnimal='" + typeOfAnimal + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
