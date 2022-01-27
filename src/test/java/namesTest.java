import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class namesTest {
    private ByteArrayOutputStream console;

    private Kabaddi kabaddi;

    @BeforeEach
    public void setUp() {
        /* Redirect the stdout to our printstream
         * to monitor console output. */
        console = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(console);
        System.setOut(ps);

        kabaddi = new Kabaddi();
    }

    @Test
    public void printTeamNamesTest(){
        kabaddi.printTeamSurnames("Name1 Surname1, Name2 Surname2, Name3 Surname3");
        assertEquals("Surname1\nSurname2\nSurname3\n", console.toString());
    }

    @Test
    public void printTeamNamesFunTest(){
        kabaddi.printTeamSurnamesFun("Name1 Surname1, Name2 Surname2, Name3 Surname3");
        assertEquals("Surname1\nSurname2\nSurname3\n", console.toString());
    }
}
