import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    //Create params for student
    DateTime dob = new DateTime(2000, 1, 1, 0, 0);
    ArrayList<Module> modules = new ArrayList<>();
    ArrayList<CourseProgramme> courses = new ArrayList<>();
    //Create student
    Student testStudent = new Student("Joe Smith", 21, dob, 123456, courses, modules);

    // Test getUsername
    @Test
    public void testGetUsername() {
        String expected = "Joe Smith21";
        Assertions.assertEquals(expected, testStudent.getUsername());
    }

    // Test getter and setter for name
    @Test
    public void testName(){
        // Test getName
        String expected = "Joe Smith";
        Assertions.assertEquals(expected, testStudent.getName());
        // Test setName
        String changed = "John Smith";
        testStudent.setName(changed);
        Assertions.assertEquals(changed, testStudent.getName());
    }

    // Test getter and setter for age
    @Test
    public void testAge(){
        // Test getAge
        int expected = 21;
        Assertions.assertEquals(expected, testStudent.getAge());
        // Test setAge
        int changed = 123;
        testStudent.setAge(changed);
        Assertions.assertEquals(changed, testStudent.getAge());
    }

    // Test getter and setter for dob
    @Test
    public void testDOB(){
        // Test getDOB
        DateTime expected = new DateTime(2000, 1, 1, 0, 0);
        Assertions.assertEquals(expected, testStudent.getDOB());
        // Test setDOB
        DateTime changed =  new DateTime(1974, 11, 12, 0, 0);
        testStudent.setDOB(changed);
        Assertions.assertEquals(changed, testStudent.getDOB());
    }

    // Test getter and setter for ID
    @Test
    public void testID(){
        // Test getID
        int expected = 123456;
        Assertions.assertEquals(expected, testStudent.getID());
        // Test setID
        int changed = 654321;
        testStudent.setID(changed);
        Assertions.assertEquals(changed, testStudent.getID());
    }

    // Test functions for registeredModules
    @Test
    public void testModules(){
        // Test getRegisteredModules
        ArrayList<Module> expected = new ArrayList<>();
        Assertions.assertEquals(expected, testStudent.getRegisteredModules());
        // Test addModule
        Module module = new Module("Software Engineering", "CT100", new ArrayList<>(), new ArrayList<>());
        expected.add(module);
        testStudent.addModule(module);
        Assertions.assertEquals(expected, testStudent.getRegisteredModules());
        // Test setRegisteredModules
        Module module1 = new Module("Programming","CT101", new ArrayList<>(), new ArrayList<>());
        Module module2 = new Module("Algorithms","CT102", new ArrayList<>(), new ArrayList<>());
        Module module3 = new Module("Networks","CT103", new ArrayList<>(), new ArrayList<>());
        expected = new ArrayList<>(List.of(module1, module2, module3));
        ArrayList<Module> changed = new ArrayList<>(List.of(module1, module2, module3));
        testStudent.setRegisteredModules(changed);
        Assertions.assertEquals(expected, testStudent.getRegisteredModules());
        // Test removeModule
        expected = new ArrayList<>(List.of(module1, module3));
        testStudent.removeModule(1);
        Assertions.assertEquals(expected, testStudent.getRegisteredModules());
    }

    // Test functions for courses
    @Test
    public void testCourses(){
        // Test getCourses
        ArrayList<CourseProgramme> expected = new ArrayList<>();
        Assertions.assertEquals(expected, testStudent.getCourses());
        // Test addCourse
        CourseProgramme course = new CourseProgramme("CSIT", new ArrayList<>(), new ArrayList<>(), DateTime.now(), DateTime.now());
        expected.add(course);
        testStudent.addCourse(course);
        Assertions.assertEquals(expected, testStudent.getCourses());
        // Test setCourses
        CourseProgramme course1 = new CourseProgramme("CSIT", new ArrayList<>(), new ArrayList<>(), DateTime.now(), DateTime.now());
        CourseProgramme course2 = new CourseProgramme("ECE", new ArrayList<>(), new ArrayList<>(), DateTime.now(), DateTime.now());
        CourseProgramme course3 = new CourseProgramme("Arts", new ArrayList<>(), new ArrayList<>(), DateTime.now(), DateTime.now());
        expected = new ArrayList<>(List.of(course1, course2, course3));
        ArrayList<CourseProgramme> changed = new ArrayList<>(List.of(course1, course2, course3));
        testStudent.setCourses(changed);
        Assertions.assertEquals(expected, testStudent.getCourses());
        // Test removeCourse
        expected = new ArrayList<>(List.of(course1, course3));
        testStudent.removeCourse(1);
        Assertions.assertEquals(expected, testStudent.getCourses());
    }
}

