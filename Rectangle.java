public class Rectangle {
    int lenght;
    int width;

    public Rectangle(int rectangle_length, int rectangle_width){
        lenght = rectangle_length;
        width = rectangle_width;
    }
    static void Perimeter (int rectangle_length, int rectangle_width){
        int result = 2*rectangle_length + 2*rectangle_width;
        System.out.println("Perimeter = " + result);
        }
    static void Square (int rectangle_length, int rectangle_width) {
        int result2 = rectangle_length * rectangle_width;
        System.out.println("Square = " + result2);
    }
}

