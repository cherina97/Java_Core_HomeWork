public class Kermo {

    private int diametr;
    private int width;

    Kermo (int diametr, int width){
        this.diametr = diametr;
        this.width = width;
    }

//    public void changeDiametr(int n){
//        diametr *= n;
//    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Кермо{" +
                "Діаметр руля=" + diametr +
                ", товщина руля=" + width +
                '}';
    }
}
