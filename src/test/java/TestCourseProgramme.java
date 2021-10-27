import org.checkerframework.checker.units.qual.A;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class TestCourseProgramme {
    //Create params for CourseProgramme
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Module> modules = new ArrayList<>();
    DateTime startDate = new DateTime(2021, 9, 1, 0, 0);
    DateTime endDate = new DateTime(2022, 5, 1, 0, 0);
    //Create CourseProgramme
    CourseProgramme testCourse = new CourseProgramme("CSIT", modules,  students, startDate, endDate);

    // Test getter and setter for name
    @Test
    public void testName(){
        // Test getName
        String expected = "CSIT";
        Assertions.assertEquals(expected, testCourse.getName());
        // Test setName
        String changed = "Algorithms";
        testCourse.setName(changed);
        Assertions.assertEquals(changed, testCourse.getName());
    }

    // Test functions for modules
    @Test
    public void testModules(){
        // Test getModules
        ArrayList<Module> expected = new ArrayList<>();
        Assertions.assertEquals(expected, testCourse.getModules());
        // Test addModule
        Module module = new Module("Software Engineering", "CT100", new ArrayList<>(), new ArrayList<>());
        expected.add(module);
        testCourse.addModule(module);
        Assertions.assertEquals(expected, testCourse.getModules());
        // Test setModules
        Module module1 = new Module("Programming","CT101", new ArrayList<>(), new ArrayList<>());
        Module module2 = new Module("Algorithms","CT102", new ArrayList<>(), new ArrayList<>());
        Module module3 = new Module("Networks","CT103", new ArrayList<>(), new ArrayList<>());
        expected = new ArrayList<>(List.of(module1, module2, module3));
        ArrayList<Module> changed = new ArrayList<>(List.of(module1, module2, module3));
        testCourse.setModules(changed);
        Assertions.assertEquals(expected, testCourse.getModules());
        // Test removeModule
        expected = new ArrayList<>(List.of(module1, module3));
        testCourse.removeModule(1);
        Assertions.assertEquals(expected, testCourse.getModules());
    }

    // Test functions for students
    @Test
    public void testStudents(){
        // Test getStudents
        ArrayList<Student> expected = new ArrayList<>();
        Assertions.assertEquals(expected, testCourse.getStudents());
        // Test addStudent
        Student student = new Student("Joe Smith", 21, DateTime.now(), 123456, new ArrayList<>(), new ArrayList<>());
        expected.add(student);
        testCourse.addStudent(student);
        Assertions.assertEquals(expected, testCourse.getStudents());
        // Test setStudents
        Student student1 = new Student("John Smith", 20, DateTime.now(), 123456, new ArrayList<>(), new ArrayList<>());
        Student student2 = new Student("Jack Smith", 22, DateTime.now(), 135791, new ArrayList<>(), new ArrayList<>());
        Student student3 = new Student("James Smith", 92, DateTime.now(), 246802, new ArrayList<>(), new ArrayList<>());
        expected = new ArrayList<>(List.of(student1, student2, student3));
        ArrayList<Student> changed = new ArrayList<>(List.of(student1, student2, student3));
        testCourse.setStudents(changed);
        Assertions.assertEquals(expected, testCourse.getStudents());
        // Test removeStudent
        expected = new ArrayList<>(List.of(student1, student3));
        testCourse.removeStudent(1);
        Assertions.assertEquals(expected, testCourse.getStudents());
    }

    // Test getter and setter for startDate
    @Test
    public void testStartDate(){
        // Test getStartDate
        DateTime expected = new DateTime(2021, 9, 1, 0, 0);
        Assertions.assertEquals(expected, testCourse.getStartDate());
        // Test setStartDate
        DateTime changed = new DateTime(2021, 9, 11, 0, 0);
        testCourse.setStartDate(changed);
        Assertions.assertEquals(changed, testCourse.getStartDate());
    }

    // Test getter and setter for endDate
    @Test
    public void testEndDate(){
        // Test getEndDate
        DateTime expected = new DateTime(2022, 5, 1, 0, 0);
        Assertions.assertEquals(expected, testCourse.getEndDate());
        // Test setEndDate
        DateTime changed = new DateTime(2024, 5, 31, 0, 0);
        testCourse.setEndDate(changed);
        Assertions.assertEquals(changed, testCourse.getEndDate());
    }
}

