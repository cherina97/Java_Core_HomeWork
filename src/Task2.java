import com.lgs.lab.interface2.MyCalculator;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        double a = scanner.nextDouble();
        System.out.println("Введіть друге число: ");
        double b = scanner.nextDouble();

        if ( b == 0){
            System.out.println("На ноль ділити не можна!");
        } else {
            System.out.println("Результат ділення: " + myCalculator.divide(a, b));
            System.out.println("Результат віднімання: " + myCalculator.minus(a, b));
            System.out.println("Результат множення: " + myCalculator.multyply(a, b));
            System.out.println("Результат додавання: " + myCalculator.plus(a, b));
        }
    }
}