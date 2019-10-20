public class Task1 {
    public static void main(String[] args){

        Rectangle rectangle = new Rectangle(25, 6);
        System.out.println("Length is: " + rectangle.lenght + "\nWidth is: " + rectangle.width);

        rectangle.Perimeter(rectangle.lenght, rectangle.width);
        rectangle.Square(rectangle.lenght, rectangle.width);

    }
}


