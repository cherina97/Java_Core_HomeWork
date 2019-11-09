package Task1;

public class Wheel {

    private int diameter;
    private String wheelMaterial;

    public int getDiameter() {
        return diameter;
    }

    public String getWheelMaterial() {
        return wheelMaterial;
    }

    public Wheel(int diameter, String wheelMaterial) {
        this.diameter = diameter;
        this.wheelMaterial = wheelMaterial;
    }

    @Override
    public String toString() {
        return "Task1.Wheel{" +
                "diameter=" + diameter +
                ", wheelMaterial='" + wheelMaterial + '\'' +
                '}';
    }
}