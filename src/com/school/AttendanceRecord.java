

public class AttendanceRecord implements Storable {
    private int studentId;
    private int courseId;
    private boolean present;

    public AttendanceRecord(int studentId, int courseId, boolean present) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.present = present;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public boolean isPresent() {
        return present;
    }

    public void displayRecord() {
        System.out.println("Student ID: " + studentId +
                           ", Course ID: " + courseId +
                           ", Present: " + (present ? "Yes" : "No"));
    }

    @Override
    public String toDataString() {
        return studentId + "," + courseId + "," + (present ? "Present" : "Absent");
    }
}
