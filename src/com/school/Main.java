public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "10th Grade");
        Teacher teacher = new Teacher("Mr. Smith", "Mathematics");
        Staff staff = new Staff("John", "Librarian");

        System.out.println("--- Student Details ---");
        student.displayDetails();

        System.out.println("\n--- Teacher Details ---");
        teacher.displayDetails();

        System.out.println("\n--- Staff Details ---");
        staff.displayDetails();

        // Example of AttendanceRecord usage with getId()
        AttendanceRecord record = new AttendanceRecord(student.getId(), "2025-09-25", true);
        record.displayRecord();
    }
}
