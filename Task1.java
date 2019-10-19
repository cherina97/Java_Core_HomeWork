public class Task1 {
    public static void main(String[] args){

        Rectangle rectangle = new Rectangle(25, 6);
        System.out.println("Length is: " + rectangle.lenght + "\nWidth is: " + rectangle.width);
        int result = Perimeter(rectangle.lenght, rectangle.width);
        System.out.println("Perimeter = " + result);
        int result2 = Square(rectangle.lenght, rectangle.width);
        System.out.println("Square = " + result2);
    }
    static int Perimeter (int rectangle_length, int rectangle_width){
        int result = 2*rectangle_length + 2*rectangle_width;
        return result;
    }
    static int Square (int rectangle_length, int rectangle_width) {
        int result2 = rectangle_length * rectangle_width;
        return result2;
    }
}


