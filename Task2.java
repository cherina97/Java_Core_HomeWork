public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.Square(2.36);
        circle.Lenght(5.3);
    }
}
class Circle {

    static void Square ( double r){
        double result = 3.14 * r * r;
        System.out.println(result);
    }
    static void Lenght ( double d){
        double result2 = 2 * 3.14 * d;
        System.out.println(result2);
    }
}
