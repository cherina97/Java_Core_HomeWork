import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a = scanner.nextDouble();
        if (a%1 != 0){
            System.out.println("Помилка");
        } else {
            System.out.println("Все ок");
        }
    }
}
