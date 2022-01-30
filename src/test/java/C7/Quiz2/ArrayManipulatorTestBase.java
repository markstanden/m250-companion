package C7.Quiz2;

import BaseTests.ConsoleTest;

public class ArrayManipulatorTestBase extends ConsoleTest {
    protected final int[][] FIVE_BY_SEVEN = new int[][]{{ 1, 2, 3, 4, 5, 6, 7},
                                                        { 8, 9,10,11,12,13,14},
                                                        {15,16,17,18,19,20,21},
                                                        {22,23,24,25,26,27,28},
                                                        {29,30,31,32,33,34,35}};
    protected final ArrayManipulator AM = new ArrayManipulator(FIVE_BY_SEVEN);
    protected final String ERROR = "Invalid parameter";
}
