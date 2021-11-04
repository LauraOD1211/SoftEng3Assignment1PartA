// Imports
import org.joda.time.DateTime;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private DateTime DOB;
    private int ID;
    private ArrayList<CourseProgramme> courses;
    private ArrayList<Module> registeredModules;

    //Constructor
    public Student(String name, int age, DateTime DOB, int ID, ArrayList<CourseProgramme> courses, ArrayList<Module> registeredModules){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.courses = courses;
        this.registeredModules = registeredModules;
    }

    //Functions
    public String getUsername(){
        return name+age;
    }

    public void addModule(Module module) {
        this.registeredModules.add(module);
    }

    public void removeModule(int index) {
        this.registeredModules.remove(index);
    }

    public void addCourse(CourseProgramme course) {
        this.courses.add(course);
    }

    public void removeCourse(int index) {
        this.courses.remove(index);
    }

    //Getters
    public String getName() {
        return name;

    }
    public int getAge() {
        return age;
    }

    public DateTime getDOB() {
        return DOB;
    }

    public int getID(){
        return ID;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    public ArrayList<Module> getRegisteredModules() {
        return registeredModules;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }

    public void setRegisteredModules(ArrayList<Module> registeredModules) {
        this.registeredModules = registeredModules;
    }
}
