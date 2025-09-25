
public class Student extends Person implements Storable {
    private String gradeLevel;

    public Student(String name, String gradeLevel) {
        super(name);
        this.gradeLevel = gradeLevel;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Student");
        System.out.println("Grade Level: " + gradeLevel);
    }


    public String toDataString() {
        return getId() + "," + getName() + "," + gradeLevel;
    }
}
