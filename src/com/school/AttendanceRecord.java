public class AttendanceRecord {
    private int studentId;
    private String date;
    private boolean present;

    // Constructor
    public AttendanceRecord(int studentId, String date, boolean present) {
        this.studentId = studentId;
        this.date = date;
        this.present = present;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getDate() {
        return date;
    }

    public boolean isPresent() {
        return present;
    }

    // Method to display record
    public void displayRecord() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Date: " + date);
        System.out.println("Present: " + (present ? "Yes" : "No"));
    }
}
