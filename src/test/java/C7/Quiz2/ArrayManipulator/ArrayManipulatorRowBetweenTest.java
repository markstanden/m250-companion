package C7.Quiz2.ArrayManipulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayManipulatorRowBetweenTest extends ArrayManipulatorTestBase {

    /*
    The method should print out the elements in the row of myArray given by aRow,
    from index anIndex to index anotherIndex (inclusive).
    The values should be printed on a single line, with a space after each.

    You can assume that anIndex and anotherIndex are greater than or equal to 0,
    but your method should check that anIndex, anotherIndex,
    and aRow are valid, and that anIndex is less than or equal to anotherIndex.

    Use array[Row][Column]
    */

    @Test
    void printARowBetweenFirstElement() {
        AM.printARowBetween(0,0, 0);
        assertEquals("1", getStrippedConsole());
    }

    @Test
    void printARowBetweenLastElement() {
        AM.printARowBetween(6,6, 4);
        assertEquals("35", getStrippedConsole());
    }

    @Test
    void printARowBetweenFirstRow() {
        AM.printARowBetween(0,6, 0);
        assertEquals("1 2 3 4 5 6 7", getStrippedConsole());
    }

    @Test
    void printARowBetweenLastRow() {
        AM.printARowBetween(0,6, 4);
        assertEquals("29 30 31 32 33 34 35", getStrippedConsole());
    }

    @Test
    void printARowBetweenStart2() {
        AM.printARowBetween(0,4, 1);
        assertEquals("8 9 10 11 12", getStrippedConsole());
    }

    @Test
    void printARowBetweenEnd4() {
        AM.printARowBetween(2,6, 3);
        assertEquals("24 25 26 27 28", getStrippedConsole());
    }

    /*If any of the parameters are invalid, the method should print out "Invalid parameter".*/

    @Test
    void invalidAnIndex() {
        AM.printARowBetween(7,6, 0);
        assertEquals(ERROR, getStrippedConsole());
    }

    @Test
    void invalidAnotherIndex() {
        AM.printARowBetween(0,7, 0);
        assertEquals(ERROR, getStrippedConsole());
    }

    @Test
    void invalidAnotherIndexLowerThanAnIndex() {
        AM.printARowBetween(1,0, 0);
        assertEquals(ERROR, getStrippedConsole());
    }

    @Test
    void invalidARow() {
        AM.printARowBetween(0,0, 5);
        assertEquals(ERROR, getStrippedConsole());
    }



}