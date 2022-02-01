import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallStringTest extends ConsoleTest {
    @Test
    void cat() {
        SmallString t = new SmallString();
        t.smallString("   CAT   ");
        assertEquals("a", getStrippedConsole(), "cat");
    }

    @Test
    void elephant() {
        SmallString t = new SmallString();
        t.smallString(" ELEPHANT ");
        assertEquals("lephan", getStrippedConsole(), "elephant");
    }

    @Test
    void be() {
        SmallString t = new SmallString();
        t.smallString("  BE  ");
        assertEquals("String too short", getStrippedConsole(), "cat");
    }
}