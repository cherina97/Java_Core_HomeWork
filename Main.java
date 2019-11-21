import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        Class<Animal> animalClass = Animal.class;

        System.out.println("Повна назва класу: " + animalClass.getName());
        System.out.println("Проста назва класу: " + animalClass.getSimpleName());
        int mod = animalClass.getModifiers();
        System.out.println("Кількість модифікаторів доступу: " + mod);
        System.out.println("Чи є клас Public? " + Modifier.isPublic(mod));
        System.out.println("Чи є клас Static? " + Modifier.isStatic(mod));
        System.out.println("Пакет класу: " + animalClass.getPackage());
        System.out.println("Батьківський клас: " + animalClass.getSuperclass());
        System.out.println();

        System.out.println("\tСписок конструкторів:");
        Constructor<?>[] constructors = animalClass.getConstructors();
        for (Constructor constructor: constructors){
            System.out.println(constructor);
        }
        System.out.println("Кількість конструкторів: " + animalClass.getConstructors().length);
        System.out.println();

        System.out.println("\tСписок доступних полів: ");
        Field[] fields = animalClass.getFields();
        for (Field field: fields){
            System.out.println(field);
        }
        System.out.println();
        System.out.println("\tСписок всіх полів: ");
        Field[] declaredFields = animalClass.getDeclaredFields();
        for (Field field: declaredFields){
            System.out.println(field);
        }
        System.out.println();

        System.out.println("\tСписок всіх методів: ");
        Method[] methods = animalClass.getMethods();
        for (Method me:methods) {
            System.out.println(me);
        }
        System.out.println();

        System.out.println("\tСтворення нового об'єкту за домопогою рефлексії");
        Constructor<Animal> constructor1 = animalClass.getConstructor(String.class, int.class, int.class);
        Animal newInstance = constructor1.newInstance(new Object[]{"Cat", 10, 8});
        System.out.println(newInstance);
        System.out.println();

        System.out.println("\tЗміна параметра за домопогою рефлексії");
        Field animalClassField = animalClass.getDeclaredField("typeOfAnimal");
        animalClassField.setAccessible(true);
        animalClassField.set(newInstance, "Dog");
        System.out.println(newInstance);
        System.out.println();

        System.out.println("\tЗміна параметра за домопогою рефлексії");
        Method setSpeed = animalClass.getMethod("setSpeed", int.class);
        setSpeed.invoke(newInstance, 20);
        System.out.println(newInstance);
        System.out.println();

        System.out.println("\tВиклик метода за домопогою рефлексії");
        Method setNick = animalClass.getMethod("setNick", String.class, int.class);
        setNick.invoke(newInstance, "Rex", 5);
        System.out.println(newInstance);
        System.out.println();
    }
}
