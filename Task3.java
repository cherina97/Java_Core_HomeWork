import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a line: ");
        String str = br.readLine();

        int count = 0;
        if (str.length() != 0){
            count++;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == ' '){
                    count++;
                }
            }
        }

        System.out.println("In this line " + count + " words.");
    }
}
