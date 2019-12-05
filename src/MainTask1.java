import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MainTask1 {
    public static void main(String[] args) throws IOException {

        List<String> stringList = getAnnotationValues(Animals.class);
        for( String s : stringList){
            System.out.println(s);
        }

        File file = new File("Annotation.txt");
        writeAnnotationToFile(stringList, file);
    }

    private static void writeAnnotationToFile(List<String> stringList, File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream ous = new ObjectOutputStream(fos);
        ous.writeObject(stringList);
        fos.close();
        ous.close();
    }

    private static List<String> getAnnotationValues(Class<Animals> animalsClass) {
        List <String> annotationValues = new ArrayList<>();

        Field[] fields = animalsClass.getDeclaredFields();
        for(Field field : fields){
            if (field.getAnnotation(MyAnnotation.class) instanceof MyAnnotation){
                annotationValues.add("The field " + field.getName() + " with type " +  field.getType().getSimpleName()
                        + " has annotation " + field.getAnnotation(MyAnnotation.class).value());
            }
        }
        return annotationValues;
    }
}
