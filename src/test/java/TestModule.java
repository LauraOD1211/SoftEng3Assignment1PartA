import org.checkerframework.checker.units.qual.A;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class TestModule {
    //Create params for Module
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<CourseProgramme> courses = new ArrayList<>();
    //Create Module
    Module testModule = new Module("Programming", "CT101", students, courses);

    // Test getter and setter for module name
    @Test
    public void testModuleName(){
        // Test getModuleName
        String expected = "Programming";
        Assertions.assertEquals(expected, testModule.getModuleName());
        // Test setName
        String changed = "Algorithms";
        testModule.setModuleName(changed);
        Assertions.assertEquals(changed, testModule.getModuleName());
    }

    // Test getter and setter for ID
    @Test
    public void testID(){
        // Test getID
        String expected = "CT101";
        Assertions.assertEquals(expected, testModule.getID());
        // Test setID
        String changed = "CT102";
        testModule.setID(changed);
        Assertions.assertEquals(changed, testModule.getID());
    }

    // Test functions for students
    @Test
    public void testStudents(){
        // Test getStudents
        ArrayList<Student> expected = new ArrayList<>();
        Assertions.assertEquals(expected, testModule.getStudents());
        // Test addStudent
        Student student = new Student("Joe Smith", 21, DateTime.now(), 123456, new ArrayList<>(), new ArrayList<>());
        expected.add(student);
        testModule.addStudent(student);
        Assertions.assertEquals(expected, testModule.getStudents());
        // Test setStudents
        Student student1 = new Student("John Smith", 20, DateTime.now(), 123456, new ArrayList<>(), new ArrayList<>());
        Student student2 = new Student("Jack Smith", 22, DateTime.now(), 135791, new ArrayList<>(), new ArrayList<>());
        Student student3 = new Student("James Smith", 92, DateTime.now(), 246802, new ArrayList<>(), new ArrayList<>());
        expected = new ArrayList<>(List.of(student1, student2, student3));
        ArrayList<Student> changed = new ArrayList<>(List.of(student1, student2, student3));
        testModule.setStudents(changed);
        Assertions.assertEquals(expected, testModule.getStudents());
        // Test removeStudent
        expected = new ArrayList<>(List.of(student1, student3));
        testModule.removeStudent(1);
        Assertions.assertEquals(expected, testModule.getStudents());
    }

    // Test functions for courses
    @Test
    public void testCourses(){
        // Test getCourses
        ArrayList<CourseProgramme> expected = new ArrayList<>();
        Assertions.assertEquals(expected, testModule.getCourses());
        // Test addCourse
        CourseProgramme course = new CourseProgramme("CSIT", new ArrayList<>(), new ArrayList<>(), DateTime.now(), DateTime.now());
        expected.add(course);
        testModule.addCourse(course);
        Assertions.assertEquals(expected, testModule.getCourses());
        // Test setCourses
        CourseProgramme course1 = new CourseProgramme("CSIT", new ArrayList<>(), new ArrayList<>(), DateTime.now(), DateTime.now());
        CourseProgramme course2 = new CourseProgramme("ECE", new ArrayList<>(), new ArrayList<>(), DateTime.now(), DateTime.now());
        CourseProgramme course3 = new CourseProgramme("Arts", new ArrayList<>(), new ArrayList<>(), DateTime.now(), DateTime.now());
        expected = new ArrayList<>(List.of(course1, course2, course3));
        ArrayList<CourseProgramme> changed = new ArrayList<>(List.of(course1, course2, course3));
        testModule.setCourses(changed);
        Assertions.assertEquals(expected, testModule.getCourses());
        // Test removeCourse
        expected = new ArrayList<>(List.of(course1, course3));
        testModule.removeCourse(1);
        Assertions.assertEquals(expected, testModule.getCourses());
    }
}

