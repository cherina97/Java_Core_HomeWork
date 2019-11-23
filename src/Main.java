public class Main {
    public static void main(String[] args) {

        Integer[] numbers = {20, 13, -23, 10, 90, -30, 63, 30, -34, -10};

        Collection collection = new Collection(numbers);

        System.out.println("Вивід масиву від початку до кінця з заміною парних чисел на 0: ");
        Iterator forward = collection.createForwardIterator();
        while (forward.hasNext()){
            Integer next = forward.next();
            if (next %2 == 0){
                System.out.println(0);
            } else {
                System.out.println(next);
            }
        }
        System.out.println();

        System.out.println("Вивід масиву від кінця до початку з виведенням через одну цифру: ");
        Iterator backward = collection.createBackwardIterator();
        while (backward.hasNext()){
            Integer next = backward.next();
            System.out.println(next);
        }
        System.out.println();

        System.out.println("Анонімний клас (кожен третій непарний елемент з кінця): ");
        Iterator backwardAnonymous = collection.BackwardAnonymous();
        while (backwardAnonymous.hasNext()){
            Integer next = backwardAnonymous.next();
            if (next %2 != 0){
                System.out.println(next);
            }
        }
        System.out.println();

        System.out.println("Локальний клас (кожен п'ятий парний елемент масиву мінус 100 з початку): ");
        Iterator forwardLocal = collection.ForwardLocal();

        int j = 1;
        while (forwardLocal.hasNext()) {
            Integer next = forwardLocal.next();
            if (j % 5 == 0) {
                if (next % 2 == 0) {
                    System.out.println("Заміна парного на " + (next - 100));
                } else {
                    System.out.println(next);
                }
            } else {
                System.out.println(next);
            }
            j++;
        }
        System.out.println();

        System.out.println("Статичний клас(кожен другий парний елемент масиву зробити непарним з початку): ");
        Iterator forwardStatic = Collection.createForwardStatic();

        int k = 1;
        while (forwardStatic.hasNext()) {
            Integer next = forwardStatic.next();
            if (k % 2 == 0) {
                if (next % 2 == 0) {
                    System.out.println("Заміна парного на " + (next + 1));
                } else {
                    System.out.println(next);
                }
            } else {
                System.out.println(next);
            }
            k++;
        }


    }
}
