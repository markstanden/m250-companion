package C7.Activities.Act20.Kabaddi;

import BaseTests.ConsoleTest;
import C7.Activities.Act20.Kabaddi.Kabaddi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KabaddiTest extends ConsoleTest {
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
    public void printTeamNamesFunRegexSplitTest() {
        kabaddi.printTeamSurnamesFun("Name1 Surname1, Name2 Surname2, Name3 Surname3");
        assertEquals("Surname1\nSurname2\nSurname3", getStrippedConsole());
    }

    @Test
    public void printTeamNamesFunSimpleSplitTest() {
        kabaddi.printTeamSurnamesFunSimple("Name1 Surname1, Name2 Surname2, Name3 Surname3");
        assertEquals("Surname1\nSurname2\nSurname3", getStrippedConsole());
    }
}
