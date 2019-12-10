package Task3;

public class Main {
    public static void main(String[] args) {

        View floatMax = string -> System.out.println(string);
        floatMax.view("The max of float in exp is " + Float.MAX_EXPONENT);
        floatMax.view("The min of float in exp is " + Float.MIN_EXPONENT);

        View doubleMax = string -> System.out.println(string);
        doubleMax.view("The max of double in exp is " + Double.MAX_EXPONENT);
        doubleMax.view("The min of double in exp is " + Double.MIN_EXPONENT);

    }
}
