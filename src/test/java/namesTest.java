import BaseTests.ConsoleTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class namesTest extends ConsoleTest {
    private Kabaddi kabaddi;

    @BeforeEach
    public void setUp() {
        super.setUp();
        kabaddi = new Kabaddi();
    }

    @Test
    public void printTeamNamesTest() {
        kabaddi.printTeamSurnames("Name1 Surname1, Name2 Surname2, Name3 Surname3");
        assertEquals("Surname1\nSurname2\nSurname3", getStrippedConsole());
    }

    @Test
    public void printTeamNamesFunTest() {
        kabaddi.printTeamSurnamesFun("Name1 Surname1, Name2 Surname2, Name3 Surname3");
        assertEquals("Surname1\nSurname2\nSurname3", getStrippedConsole());
    }
}
