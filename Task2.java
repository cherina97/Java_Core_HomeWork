import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input string: ");
        String string = bufferedReader.readLine().toLowerCase();

        String string2 = string.replaceAll("[aeiouy]", "-");
        System.out.println("Output string:");
        System.out.println(string2);

    }
}
