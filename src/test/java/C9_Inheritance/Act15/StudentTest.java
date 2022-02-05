package C9_Inheritance.Act15;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest extends ConsoleTest {

    @Test
    void testPolymorphicPrintPerson() {
        Person p = new Student(1, "Test");
        p.printPerson();
        assertEquals("Person called Test", getStrippedConsole());
    }

    @Test
    void testPrintStudent() {
        Student s = new Student(1, "Test");
        s.printStudent();
        assertEquals("Student called Test with id 1", getStrippedConsole());
    }

    @Test
    void testCastPrintStudent() {
        Person p = new Student(1, "Test");
        Student s = (Student) p;
        s.printStudent();
        assertEquals("Student called Test with id 1", getStrippedConsole());
    }

    @Test
    void testGetID() {
        Student s = new Student(1, "Test");
        assertEquals(1, s.getId());
    }
}