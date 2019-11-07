public class Auto {

    private int HorsePower;
    private int yearOfProduction;
    private Wheel wheel;
    private Engine engine;

    public Auto(int horsePower, int yearOfProduction, Wheel wheel, Engine engine) {
        HorsePower = horsePower;
        this.yearOfProduction = yearOfProduction;
        this.wheel = wheel;
        this.engine = engine;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "HorsePower=" + HorsePower +
                ", yearOfProduction=" + yearOfProduction +
                ", wheel=" + wheel +
                ", engine=" + engine +
                '}';
    }
}
