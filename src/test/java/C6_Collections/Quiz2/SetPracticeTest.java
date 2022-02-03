package C6_Collections.Quiz2;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SetPracticeTest extends ConsoleTest {
    SetPractice ts;

    @BeforeEach
    public void setUp() {
        super.setUp();

        HashSet<Integer> testData = new HashSet<>();
        Stream.iterate(1, x -> x + 1)
                .limit(100)
                .forEach(i -> testData.add(i));

        ts = new SetPractice(testData);
    }

    @Test
    void findSumOfValuesMoreThan99() {
        ts.findSumOfValuesMoreThan(99);
        assertEquals("100", getStrippedConsole());
    }

    @Test
    void findSumOfValuesMoreThan98() {
        ts.findSumOfValuesMoreThan(98);
        assertEquals("199", getStrippedConsole());
    }

    @Test
    void findSumOfValuesMoreThan100() {
        ts.findSumOfValuesMoreThan(100);
        assertEquals("none found", getStrippedConsole());
    }

    @Test
    void findSumOfValuesMoreThan0() {
        ts.findSumOfValuesMoreThan(0);
        assertEquals("5050", getStrippedConsole());
    }
}