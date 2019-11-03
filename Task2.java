public class Task2 {
    public static void main(String[] args) throws MyException {
        Methods methods = new Methods();

        methods.suma(-1, -1);
        methods.suma(0, 5);
        methods.suma(5, 0);
        methods.suma(0, 0);
        methods.suma(5, 5);

        methods.dilennya(-1, -1);
        methods.dobytk(0,0);
        methods.riznytsya(5,5);
    }
}
