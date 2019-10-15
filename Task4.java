import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\s");
        for (String subStr : words) {
            System.out.println(subStr + "  " + subStr.length());
        }
    }
}
