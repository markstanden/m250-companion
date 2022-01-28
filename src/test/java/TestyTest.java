import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TestyTest {
    ByteArrayOutputStream console;

    @BeforeEach
    public void setUp() {
        /* Redirect the stdout to our printstream
         * to monitor console output. */
        console = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(console);
        System.setOut(ps);
    }

    @Test
    void cat() {
        Testy t = new Testy();
        t.smallString("   CAT   ");
        assertEquals("a\n", console.toString(), "cat");
    }

    @Test
    void elephant() {
        Testy t = new Testy();
        t.smallString(" ELEPHANT ");
        assertEquals("lephan\n", console.toString(), "elephant");
    }

    @Test
    void be() {
        Testy t = new Testy();
        t.smallString("  BE  ");
        assertEquals("String too short\n", console.toString(), "cat");
    }
}