import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File fileEmployee = new File("FileEmployee.txt");
        Employee employee = new Employee("Pavlo", 1, 10000);
        System.out.println("Before serialize/deserialize : \n" + employee);
        System.out.println();

        System.out.println("After serialize/deserialize : ");
        Methods.serialize(employee, fileEmployee);
        System.out.println(Methods.deserialize(fileEmployee));
        System.out.println();

        File fileListOfEmployees = new File("FileListOfEmployees.txt");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(new Employee("Dmytro", 3, 15000));
        employeeList.add(new Employee("Olha", 7, 8000));
        employeeList.add(new Employee("Vasyl", 15, 45000));
        employeeList.add(new Employee("Nataly", 6, 32000));
        employeeList.add(new Employee("Olena", 3, 75000));

        System.out.println("List before serialize/deserialize: ");
        for(Employee employee1: employeeList){
            System.out.println(employee1);
        }
        System.out.println();

        System.out.println("List after serialize/deserialize:");
        Methods.serialize(employeeList, fileListOfEmployees);
        List<Employee> employeeDeserialize = new ArrayList<>();
        employeeDeserialize = (List<Employee>) Methods.deserialize(fileListOfEmployees);
        for(Employee employee1:employeeDeserialize){
            System.out.println(employee1);
        }
    }
}
