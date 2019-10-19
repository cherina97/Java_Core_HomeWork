public class Rectangle {
    int lenght;
    int width;
    //    public Rectangle(){
//        lenght = 10;
//        width = 2;
//    }
    public Rectangle(int rectangle_length, int rectangle_width){
        lenght = rectangle_length;
        width = rectangle_width;
    }
    static int Perimeter (int rectangle_length, int rectangle_width){
        int result = 2*rectangle_length + 2*rectangle_width;
        return result;
    }
}

