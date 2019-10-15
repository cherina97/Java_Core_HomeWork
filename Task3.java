public class Task3 {
    public static void main(String[] args) {
        int result = dobytok(5, 3, -7);
        System.out.println(result);
        double result2 = suma(5.58, 2.65);
        System.out.println(result2);
    }
    /**Множення трьох чисел
     * @param a
     * @param b
     * @param c
     * @return
     */
    static int dobytok(int a, int b, int c) {
        int result = a * b * c;
        return result;
    }

    /**Сума двох чисел
     *
     * @param a
     * @param b
     * @return
     */
    static double suma (double a, double b) {
        double result2 = a + b;
        return result2;

    }
}