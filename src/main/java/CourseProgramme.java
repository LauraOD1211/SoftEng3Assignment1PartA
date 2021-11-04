// Imports
import org.joda.time.DateTime;
import java.util.ArrayList;

public class CourseProgramme {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startDate;
    private DateTime endDate;

    // Constructor
    public CourseProgramme(String name, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.modules = modules;
        this.students = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //Functions
    public void addModule(Module module) {
        this.modules.add(module);
    }

    public void removeModule(int index) {
        this.modules.remove(index);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(int index) {
        this.students.remove(index);
    }

    // Getters
    public String getName() {
        return name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
