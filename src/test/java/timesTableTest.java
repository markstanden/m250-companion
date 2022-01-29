import BaseTests.ConsoleTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class timesTableTest extends ConsoleTest {
    private TimesTable times;

    @BeforeEach
    public void setUp() {
        super.setUp();
        times = new TimesTable();
    }

    @Test
    public void populateTestThree() {
        times.populateTimesTable(3);
        int[] table = times.getMyTimesTable();
        int[] three = new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};
        assertArrayEquals(three, table);
    }

    @Test
    public void populateTestSix() {
        times.populateTimesTable(6);
        int[] table = times.getMyTimesTable();
        int[] six = new int[]{6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72};
        assertArrayEquals(six, table);
    }

    @Test
    public void printTimesTableTest() {
        times.populateTimesTable(4);
        String expectedOutput = "1 x 4 = 4\n" +
                "2 x 4 = 8\n" +
                "3 x 4 = 12\n" +
                "4 x 4 = 16\n" +
                "5 x 4 = 20\n" +
                "6 x 4 = 24\n" +
                "7 x 4 = 28\n" +
                "8 x 4 = 32\n" +
                "9 x 4 = 36\n" +
                "10 x 4 = 40\n" +
                "11 x 4 = 44\n" +
                "12 x 4 = 48\n";
        times.printTimesTable();
        assertEquals(expectedOutput, console.toString());
    }

}
