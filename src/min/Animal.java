package min;

public class Animal implements Comparable <Animal>{
    private String typeOfAnimal;
    private Integer speed;

    public Animal(String typeOfAnimal, Integer speed) {
        this.typeOfAnimal = typeOfAnimal;
        this.speed = speed;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "min.Animal{" +
                "typeOfAnimal='" + typeOfAnimal + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(Animal o) {

        int ageDiff = this.typeOfAnimal.compareToIgnoreCase(o.typeOfAnimal);

        if (ageDiff != 0){
            return  ageDiff;
        } else {
            return this.speed.compareTo(o.getSpeed());
        }
    }

}
