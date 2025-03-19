import java.util.*;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + salary;
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Dipesh", 30, 1000000),
            new Employee("Kamal", 25, 60000),
            new Employee("anmol", 35, 70000)
        );

        
        List<String> sortlist = employees.stream()
            .sorted(Comparator.comparingDouble(e -> e.salary))  
            .map(e -> e.name + " " + e.age + " " + e.salary) 
            .collect(Collectors.toList());  

        System.out.println(sortlist); 
    }
}
