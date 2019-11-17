package max;

public class Commodity {

    private String nameOfProduct;
    private int length;
    private int weight;
    private int wight;

    public Commodity(String nameOfProduct, int length, int weight, int wight) {
        this.nameOfProduct = nameOfProduct;
        this.length = length;
        this.weight = weight;
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "ПРОДУКТ {" +
                "назва =' " + nameOfProduct + '\'' +
                ", довжина = " + length +
                ", ширина = " + weight +
                ", вага = " + wight +
                '}';
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }
}
