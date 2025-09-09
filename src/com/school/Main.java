

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Valid statuses
        AttendanceRecord record1 = new AttendanceRecord(student1.getStudentId(), course1.getCourseId(), "Present");
        AttendanceRecord record2 = new AttendanceRecord(student2.getStudentId(), course2.getCourseId(), "Absent");

        // Invalid status test
        AttendanceRecord record3 = new AttendanceRecord(student1.getStudentId(), course2.getCourseId(), "Late");

        attendanceLog.add(record1);
        attendanceLog.add(record2);
        attendanceLog.add(record3);

        // Display all records
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
