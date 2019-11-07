import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) {

        Integer [] numbers = new Integer[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) ((Math.random() * 40) - 20);
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        Arrays.sort(numbers);
        System.out.println("В порядку зростання: " + Arrays.toString(numbers));
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println("В порядку спадання: " + Arrays.toString(numbers));

    }
}
