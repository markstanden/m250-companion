package C6_Collections.Quiz3;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest extends ConsoleTest {

    @Test
    void perimeterTest() {
        double a = 3.0;
        double b = 4.0;
        // hyp = 5.0
        Triangle.perimeter(a, b);
        assertEquals("12.0", getStrippedConsole());
    }
}