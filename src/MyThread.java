import java.util.Scanner;

public class MyThread extends Thread {

    @Override
    public void run() {

        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.println("Введіть кількість чисел Фібоначі: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        System.out.print("Потік Thread: " + n1 + " ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(n2 + " ");

        for(int i = 3; i <= numbers; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n3 = n2 + n1;
            System.out.print(n3 + " ");

            n1 = n2;
            n2 = n3;

        }
    }
}
