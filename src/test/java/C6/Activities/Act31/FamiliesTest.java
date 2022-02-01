package C6.Activities.Act31;

import BaseTests.ConsoleTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FamiliesTest extends ConsoleTest {

    Families tc;

    @BeforeEach
    public void setUp() {
        super.setUp();

        HashSet<Integer> testData = new HashSet<>();
        Stream.iterate(1, x -> x + 1)
                .limit(100)
                .forEach(i -> testData.add(i));

        tc = new Families();

        HashSet<String> three = new HashSet<>();
        three.add("Brian");
        three.add("Gary");
        tc.children.put(3, three);

        HashSet<String> four = new HashSet<>();
        four.add("Nick");
        four.add("Chris");
        tc.children.put(4, four);

        HashSet<String> five = new HashSet<>();
        five.add("Mike");
        tc.children.put(5, five);
    }

    @Test
    void moreThan3ChildrenTwo() {
        HashSet<String> one = new HashSet<>();
        one.add("John");
        one.add("Steve");
        one.add("Scott");
        one.add("Nick");
        tc.children.put(1, one);

        HashSet<String> two = new HashSet<>();
        two.add("Andy");
        two.add("Jim");
        two.add("Alex");
        tc.children.put(2, two);

        tc.moreThan3Children();
        assertEquals(2, tc.moreThanThree());
        assertEquals("2 houses have three or more children", getStrippedConsole());
    }

    @Test
    void moreThan3ChildrenOneThree() {
        HashSet<String> two = new HashSet<>();
        two.add("Andy");
        two.add("Jim");
        two.add("Alex");
        tc.children.put(2, two);

        tc.moreThan3Children();
        assertEquals(1, tc.moreThanThree());
        assertEquals("1 houses have three or more children", getStrippedConsole());
    }

    @Test
    void moreThan3ChildrenOneFour() {
        HashSet<String> two = new HashSet<>();
        two.add("Andy");
        two.add("Jim");
        two.add("Alex");
        tc.children.put(2, two);

        tc.moreThan3Children();
        assertEquals(1, tc.moreThanThree());
        assertEquals("1 houses have three or more children", getStrippedConsole());
    }

    @Test
    void moreThan3ChildrenNone() {
        tc.moreThan3Children();
        assertEquals(0, tc.moreThanThree());
        assertEquals("No houses have three or more children", getStrippedConsole());
    }


    @Test
    void totalNumChildren() {
        assertEquals(5, tc.totalNumChildren());
    }

    @Test
    void totalNumChildrenEmpty() {
        Families tc2 = new Families();
        assertEquals(0, tc2.totalNumChildren());
    }

    @Test
    void totalNumChildrenOne() {
        Families tc3 = new Families();
        HashSet<String> test = new HashSet<>();
        test.add("Johnny");
        tc3.children.put(1, test);
        assertEquals(1, tc3.totalNumChildren());
    }
}