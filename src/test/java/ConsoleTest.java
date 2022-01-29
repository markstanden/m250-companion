import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsoleTest {

    protected ByteArrayOutputStream console;

    @BeforeEach
    public void setUp() {
        /* Redirect the stdout to our printstream
         * to monitor console output. */
        console = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(console);
        System.setOut(ps);
    }
}