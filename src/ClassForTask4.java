public class ClassForTask4 {
    int age;
    String name;

    ClassForTask4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    ClassForTask4(){
        this("Ira", 20);
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
