package C6.Activities;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest extends ConsoleTest {
    Height h = new Height(10);

    @Test
    void chooseEqual() {
        h.choose(10);
        assertEquals("Greater than or equal to height", getStrippedConsole());
    }

    @Test
    void chooseLess() {
        h.choose(9);
        assertEquals("Less than height", getStrippedConsole());
    }

    @Test
    void chooseGreater() {
        h.choose(11);
        assertEquals("Greater than or equal to height", getStrippedConsole());
    }
}