

public class Student {
    private static int nextStudentIdCounter = 1; // static counter for auto ID
    private int studentId;
    private String name;

    // Constructor to initialize Student object
    public Student(String name) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}
