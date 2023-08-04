import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniversityManager {
    private static UniversityManager instance;
    private List<Student> students;
    private List<Professor> professors;
    private Map<String, Course> courses;
    private Map<String, List<Professor>> courseProfessors;

    private UniversityManager() {
        students = new ArrayList<>();
        professors = new ArrayList<>();
        courses = new HashMap<>();
        courseProfessors = new HashMap<>();
    }

    public static UniversityManager getInstance() {
        if (instance == null) {
            instance = new UniversityManager();
        }
        return instance;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.put(course.getCourseId(), course);
    }

    public void assignProfessorToCourse(String courseId, Professor professor) {
        if (courseProfessors.containsKey(courseId)) {
            courseProfessors.get(courseId).add(professor);
        } else {
            List<Professor> professors = new ArrayList<>();
            professors.add(professor);
            courseProfessors.put(courseId, professors);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public Course getCourseById(String courseId) {
        return courses.get(courseId);
    }

    public List<Professor> getProfessorsByCourse(String courseId) {
        return courseProfessors.get(courseId);
    }
}
