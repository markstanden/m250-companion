package C6.Activities.Act26;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    C6.Activities.Act26.Test t = new C6.Activities.Act26.Test();

    @BeforeEach
    void setUp() {
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
        t.populateMap(-1, "Test-1");
        t.populateMap(10000, "Test10000");

        assertEquals("Test5", t.myMap.get(5));
        assertEquals("Test0", t.myMap.get(0));
        assertEquals("Test-1", t.myMap.get(-1));
        assertEquals("Test10000", t.myMap.get(10000));
    }
}