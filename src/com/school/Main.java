
public class Main {
    public static void main(String[] args) {
        // Creating Students using constructor
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        // Creating Courses using constructor
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");
        Course c3 = new Course("Chemistry");

        // Displaying Student details
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        // Displaying Course details
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}
