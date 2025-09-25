

public class Course implements Storable {
    private int courseId;
    private String courseName;
    private static int nextCourseId = 1;

    public Course(String courseName) {
        this.courseId = nextCourseId++;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toDataString() {
        return courseId + "," + courseName;
    }
}
