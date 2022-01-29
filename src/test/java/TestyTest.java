import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestyTest extends ConsoleTest {
    @Test
    void cat() {
        Testy t = new Testy();
        t.smallString("   CAT   ");
        assertEquals("a", getStrippedConsole(), "cat");
    }

    @Test
    void elephant() {
        Testy t = new Testy();
        t.smallString(" ELEPHANT ");
        assertEquals("lephan", getStrippedConsole(), "elephant");
    }

    @Test
    void be() {
        Testy t = new Testy();
        t.smallString("  BE  ");
        assertEquals("String too short", getStrippedConsole(), "cat");
    }
}