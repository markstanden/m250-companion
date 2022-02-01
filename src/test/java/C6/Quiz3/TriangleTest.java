package C6.Quiz3;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest extends ConsoleTest {

    @Test
    void perimeterTest() {
        double a = 3.0;
        double b = 4.0;
        assertEquals(12.0, Triangle.perimeter(a, b));
    }

}