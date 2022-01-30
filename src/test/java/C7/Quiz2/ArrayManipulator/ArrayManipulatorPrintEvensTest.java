package C7.Quiz2.ArrayManipulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayManipulatorPrintEvensTest extends ArrayManipulatorTestBase {

    private final String ERROR = "Invalid column";

    /*
    Use array[Row][Column]
    */

    @Test
    void printCol1() {
        AM.printEvensInColumn(0);
        assertEquals("8 22", getStrippedConsole());
    }

    @Test
    void printCol2() {
        AM.printEvensInColumn(1);
        assertEquals("2 16 30", getStrippedConsole());
    }

    @Test
    void printCol6() {
        AM.printEvensInColumn(5);
        assertEquals("6 20 34", getStrippedConsole());
    }

    @Test
    void printCol7() {
        AM.printEvensInColumn(6);
        assertEquals("14 28", getStrippedConsole());
    }

   @Test
    void invalidAColTooHigh() {
        AM.printEvensInColumn(7);
        assertEquals(ERROR, getStrippedConsole());
    }

    @Test
    void invalidAColNegative() {
        AM.printEvensInColumn(-1);
        assertEquals(ERROR, getStrippedConsole());
    }


}