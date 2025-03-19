import java.util.*;
import java.util.stream.Collectors;

class Student { String name; double marks;
public Student(String name, double marks) { this.name = name;
this.marks = marks;
}
}
public class StudentFilter {
public static void main(String[] args) { List<Student> students = Arrays.asList(
new Student("Akriti", 80),
new Student("Adi", 70),
new Student("Anjana", 85),
new Student("Hemant", 60)
);
List<String> topStudents = students.stream()
.filter(s -> s.marks > 75)
.sorted(Comparator.comparingDouble(s -> -s.marks))
.map(s -> s.name)
.collect(Collectors.toList()); System.out.println(topStudents);
}
}
