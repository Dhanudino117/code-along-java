
public class Course {
    private static int nextCourseIdCounter = 101; // static counter for auto ID
    private int courseId;
    private String courseName;

    // Constructor to initialize Course object
    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    // Method to display course details
    public void displayDetails() {
        System.out.println("Course ID: C" + courseId + ", Name: " + courseName);
    }
}
