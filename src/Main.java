import java.util.List;

public class Main {
    public static void main(String[] args) {
        UniversityManager manager = UniversityManager.getInstance();

        Student student1 = new Student("John Doe", "123456");
        Student student2 = new Student("Jane Smith", "789012");

        manager.addStudent(student1);
        manager.addStudent(student2);

        System.out.println("List of Students:");
        List<Student> students = manager.getStudents();
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Student ID: " + student.getStudentId());
        }
    }
}
