package Task2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Throw the coin 5 times:");
        for(int i = 0; i <5; i++){
            throwTheCoin();
        }
    }
    private static void throwTheCoin() {
        Predicate <Integer> predicate = x -> x == 0;
        int side = (int) (Math.random() * 2);
        if (predicate.test(side)){
            System.out.println("Heads!");
        } else {
            System.out.println("Tails!");
        }
    }
}
