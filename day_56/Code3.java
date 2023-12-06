package day_56;

import java.util.*;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

// StudentManager module
class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return Collections.unmodifiableList(students);
    }
}

// Main module
public class Code3 {
    public static void main(String[] args) {
        // Creating instances of modules
        StudentManager studentManager = new StudentManager();
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        List<Student> allStudents = studentManager.getAllStudents();
        for (Student student : allStudents) {
            System.out.println(student);
        }
    }
}
