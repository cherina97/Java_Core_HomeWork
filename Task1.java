import java.util.Scanner;

public class Task1 {
      public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word: ");
        String str = scanner.nextLine();
        if (str.length() != 5){
            try {
                throw new WordNotAPalindrom();
            } catch (WordNotAPalindrom wordNotAPalindrom) {
                System.out.println(wordNotAPalindrom.mistake());
                wordNotAPalindrom.printStackTrace();
            }
        } else {
            System.out.println(checkPalindrom(str));
        }

    }
     public static String checkPalindrom(String str) {
         String a = str;
         String a1 = String.valueOf(new StringBuffer(a).reverse());
         if (a.equalsIgnoreCase(a1)) {
             return "It is a Palindrom";
         } else {
             return "It is not a Palindrom";
         }

     }

}
