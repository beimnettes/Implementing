import java.util.*;

@SuppressWarnings("unused")
public class Student implements Comparable<Student> {
    private int studentId;
    private String name;
    private double gpa;

    // Constructor
    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Implement compareTo method
    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa); // Ascending order by GPA
    }

    // Override toString for clear display
    @Override
    public String toString() {
        return "Student{ID=" + studentId + ", Name='" + name + "', GPA=" + gpa + "}";
    }
}
