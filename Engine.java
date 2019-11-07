public class Engine {

    private int countOfCylinders;

    public int getCountOfCylinders() {
        return countOfCylinders;
    }

    public Engine(int countOfCylinders) {
        this.countOfCylinders = countOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "countOfCylinders=" + countOfCylinders +
                '}';
    }
}
