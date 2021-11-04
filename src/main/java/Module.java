// Imports
import java.util.ArrayList;

public class Module {
    private String moduleName;
    private String ID;
    private ArrayList<Student> students;
    private ArrayList<CourseProgramme> courses;

    // Constructor
    public Module(String moduleName, String ID, ArrayList<Student> students, ArrayList<CourseProgramme> courses) {
        this.moduleName = moduleName;
        this.ID = ID;
        this.students = students;
        this.courses = courses;
    }

    // Functions
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(int index) {
        this.students.remove(index);
    }

    public void addCourse(CourseProgramme course) {
        this.courses.add(course);
    }

    public void removeCourse(int index) {
        this.courses.remove(index);
    }

    // Getters
    public String getModuleName() {
        return moduleName;
    }

    public String getID() {
        return ID;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    //Setters
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }
}
