public class Kuzov {
    private int weight;
    private int lenght;

    Kuzov (int weight, int lenght){
        this.weight = weight;
        this.lenght = lenght;
    }

//    public void changeWeight(int n){
//        weight += n;
//    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Кузов{" +
                "Ширина кузова=" + weight +
                ", Довщина кузова=" + lenght +
                '}';
    }
}
