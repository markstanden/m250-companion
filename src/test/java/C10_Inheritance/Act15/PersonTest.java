package C10_Inheritance.Act15;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest extends ConsoleTest {

    @Test
    void testPrintPerson() {
        Person p = new Person("Test");
        p.printPerson();
        assertEquals("Person called Test", getStrippedConsole());
    }

    @Test
    void testGetName() {
        Person p = new Person("Test");
        assertEquals("Test",p.getName());
    }
}