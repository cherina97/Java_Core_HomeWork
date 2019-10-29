public class AirplaneControl {


     void MoveUp(){
        int a = (int) (Math.random() * 1000);
        System.out.println("Відстань вверх: " + a);

    }
     void MoveDown(){
        int b = (int) (Math.random() * 1000);
        System.out.println("Відстань вниз: " + b);

    }
    public void MoveLeft(){
        int c = (int) (Math.random() * 2000);
        System.out.println("Відстань вліво: " + c);

    }
    public void MoveRight(){
        int d = (int) (Math.random() * 2000);
        System.out.println("Відстань вправо: " + d);

    }

}
