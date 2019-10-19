public class Task2 {
    public static void main(String[] args) {
        double result = Square(1.75);
        System.out.println("Square = " + result);
        double result2 = Lenght(3.36);
        System.out.println("Lenght = " + result2);
    }

    static double Square ( double r){
        double result = 3.14 * r * r;
        return result;
    }
    static double Lenght ( double d){
        double result2 = 2 * 3.14 * d;
        return result2;
    }
}
