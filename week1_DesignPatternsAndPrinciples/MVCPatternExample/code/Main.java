package MVCPatternExample;

public class Main {
    public static void main(String[] args) {
        // Model
        Student student = new Student("John", "S101", "A");

        // View
        StudentView view = new StudentView();

        // Controller (very simple version)
        view.displayStudentDetails(student);

        // Updating data through model
        student.setGrade("A+");
        System.out.println("\nAfter grade update:");
        view.displayStudentDetails(student);
    }
}
