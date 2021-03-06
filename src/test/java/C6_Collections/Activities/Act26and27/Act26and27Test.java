package C6_Collections.Activities.Act26and27;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Act26and27Test extends ConsoleTest {

    Act26and27 t = new Act26and27();

    @BeforeEach
    public void setUp() {
        super.setUp();
        t.populateMap(1, "Test1");
        t.populateMap(2, "Test2");
        t.populateMap(3, "Test3");
        t.populateMap(4, "Test4");
    }

    /*
    The method should first check if the key given
    by the first parameter already exists in myMap .
    If the key does not already exist in myMap,
    a new entry should be created with a key given by the first parameter
    and a value given by the second parameter.
    If the key does already exist in myMap the associated
    value should remain unchanged.
     */

    @Test
    void populateMapExists() {
        t.populateMap(1, "Overwritten");
        t.populateMap(2, "Overwritten");
        t.populateMap(3, "Overwritten");
        t.populateMap(4, "Overwritten");

        assertEquals("Test1", t.myMap.get(1));
        assertEquals("Test2", t.myMap.get(2));
        assertEquals("Test3", t.myMap.get(3));
        assertEquals("Test4", t.myMap.get(4));
    }

    @Test
    void populateMapNew() {
        t.populateMap(5, "Test5");
        t.populateMap(0, "Test0");
        t.populateMap(-1, "Act26and27-1");
        t.populateMap(10000, "Test10000");

        assertEquals("Test5", t.myMap.get(5));
        assertEquals("Test0", t.myMap.get(0));
        assertEquals("Act26and27-1", t.myMap.get(-1));
        assertEquals("Test10000", t.myMap.get(10000));
    }

    @Test
    void findEntry1() {
        t.findEntry(1);
        assertEquals("Test1", getStrippedConsole());
    }

    @Test
    void findEntry4() {
        t.findEntry(4);
        assertEquals("Test4", getStrippedConsole());
    }

    @Test
    void findEntryNegative() {
        t.findEntry(100);
        assertEquals("not found", getStrippedConsole());
    }
}