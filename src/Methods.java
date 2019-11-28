import java.io.*;

public class Methods {

    public static void serialize(Object employee, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        fileOutputStream.close();
        objectOutputStream.close();
    }

    public static Object deserialize(File file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object employee = (Object)objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();

        return employee;
    }
}
