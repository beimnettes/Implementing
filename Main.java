import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 3.5));
        students.add(new Student(2, "Bob", 3.8));
        students.add(new Student(3, "Charlie", 3.2));
        students.add(new Student(4, "Diana", 3.8));
        students.add(new Student(5, "Ethan", 3.0));

        // Print the original list
        System.out.println("Original List:");
        students.forEach(System.out::println);

        // Sort the students by GPA
        Collections.sort(students);

        // Print the sorted list
        System.out.println("\nSorted List by GPA:");
        students.forEach(System.out::println);
    }
}
