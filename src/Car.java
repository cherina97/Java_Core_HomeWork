public class Car {
    private Kermo kermo;
    private Koleso koleso;
    private Kuzov kuzov;
    private double speed = 120;

    Car(){
        kermo = new Kermo(100, 12);
        koleso = new Koleso(150);
        kuzov = new Kuzov(3500, 1500);
    }

    @Override
    public String toString() {
        return "Car{" +
                "kermo=" + kermo +
                ", koleso=" + koleso +
                ", kuzov=" + kuzov +
                ", speed=" + speed +
                '}';
    }

    public void changeCar (){
        kermo.setWidth(kermo.getWidth() * 2);
        kermo.setDiametr(kermo.getDiametr() + 50);
        koleso.setDiametr(koleso.getDiametr() / 2);
        kuzov.setWeight(kuzov.getWeight() + 1000);
        kuzov.setWeight(kuzov.getWeight() * 3);
        speed += 50;
    }
}





