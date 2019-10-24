import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Скільки раз підкидати монетку?");
        int number = sc.nextInt();
        int side;

        for (int i = 0; i < number; i++){
            side = (int)Math.random()*10;

            if (side == 0){
                System.out.println("Орел");
            } else {
                System.out.println("Решка");
            }
        }
    }
}

