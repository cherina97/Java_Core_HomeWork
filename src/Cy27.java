public class Cy27 extends Airplane implements FeaturesOfPlane {

    AirplaneControl airplaneControl = new AirplaneControl();

    void getAirplaneControl() {
        airplaneControl.MoveUp();
        airplaneControl.MoveLeft();
        airplaneControl.MoveDown();
        airplaneControl.MoveRight();
    }

    private int MaxSpeed;
    private String color;

    @Override
    public String toString() {
        return "Літак Cy27 {" +
                " максимальна швидкість = " + MaxSpeed +
                ", колір = '" + color + '\'' +
                ", довжина = " + length +
                ", ширина = " + weight +
                ", вага = " + wight +
                '}';
    }

    public Cy27(int length, int weight, int wight, int maxSpeed, String color) {
        super(length, weight, wight);
        MaxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void TurboAcceleration() {
        int speed = (int) (Math.random() * 100 + MaxSpeed);
        System.out.println("Вмикається турбо-прискорення " + speed + " кілометрів за годину.");

    }

    @Override
    public void StealthTechnology() {
        int time = (int) (Math.random() * 60);
        System.out.println("Літака не видно на радарі впродовж " + time + " хвилин. Режим Стелс активовано.");

    }

    @Override
    public void NuclearStrike() {
        int strike = (int) (Math.random() * 11) ;
        System.out.println("Буде скинуто така кількість " + strike + " боєголовок.");

    }

}
