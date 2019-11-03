public class Methods {

     void suma (int a, int b) throws MyException {
         try {
             checkNum ( a, b);
         } catch (IllegalAccessException e) {
             e.printStackTrace();
         }
         System.out.println( a + b);
     }

    private void checkNum(int a, int b) throws IllegalAccessException, MyException {
         if (a < 0 && b < 0){
             throw new IllegalArgumentException();

         } else if (( a == 0 && b != 0) || ( a != 0 && b == 0)){
             throw new ArithmeticException();

         }  else if (a == 0 && b == 0){
             throw new IllegalAccessException();

         } else if ( a > 0 && b > 0) {
             throw new MyException();
         }
    }

    void riznytsya (int a, int b){
        System.out.println( a - b);
    }

    void dobytk (int a, int b){
        System.out.println( a * b);
    }

    void dilennya (int a, int b){
        System.out.println( a / b);
    }
}
