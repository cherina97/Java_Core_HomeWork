import java.util.Scanner;

public class Deputy extends Human {

    private String surname;
    private String name;
    private int age;
    private boolean briber;
    private int valueOfTheBribe;

    public void giveABribe(){
        if (briber == false){
            System.out.println("Цей депутат не бере хабарів");
        }
        if (briber == true){
            System.out.println("Введіть суму хабаря: ");
            Scanner scanner = new Scanner(System.in);
            int bribe = scanner.nextInt();
            if (bribe > 5000){
                System.out.println("Міліція ув'язнить депутата");
            } else {
                this.valueOfTheBribe = bribe;
            }
        }
    }


    public Deputy(double weight, int height, String surmane, String name, int age, boolean briber) {
        super(weight, height);
        this.surname = surmane;
        this.name = name;
        this.age = age;
        this.briber = briber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBriber() {
        return briber;
    }

    public void setBriber(boolean briber) {
        this.briber = briber;
    }

    public int getValueOfTheBribe() {
        return valueOfTheBribe;
    }

    public void setValueOfTheBribe(int valueOfTheBribe) {
        this.valueOfTheBribe = valueOfTheBribe;
    }

    @Override
    public String toString() {
        return "Депутат{" +
                "прізвище='" + surname + '\'' +
                ", ім'я='" + name + '\'' +
                ", вік=" + age +
                ", чи є хабарником=" + briber +
                '}';
    }
}
