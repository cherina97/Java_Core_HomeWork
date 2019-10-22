public class Koleso {
    private int diametr;

    Koleso (int diametr){
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Колесо{" +
                "Діаметр колеса=" + diametr +
                '}';
    }
}
