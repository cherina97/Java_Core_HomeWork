public class Task3 {
    public static void main(String[] args) {
        Animal animal = new Animal("Rex", 52.4, 3);
        System.out.println("Nick: " + animal.getName() + ", speed = " + animal.getSpeed() + " , age = " + animal.getAge());
        animal.setName("Fazan");
        animal.setSpeed(30.6);
        animal.setAge(5);
        System.out.println("===============================================");
        System.out.println("Nick: " + animal.getName() + ", speed = " + animal.getSpeed() + " , age = " + animal.getAge());

    }
}
