package C7.Quiz2;
import java.util.stream.Stream;

public class ArrayManipulator {
    private int[][] myArray;

    public ArrayManipulator(int[][] anArray) {
        myArray = anArray;
    }

    /**
     * The method should print out the elements in the row of myArray given by aRow,
     * from index anIndex to index anotherIndex (inclusive).
     * The values should be printed on a single line, with a space after each.
     * <p>
     * If any of the parameters are invalid, the method should print out "Invalid parameter".
     *
     * @param anIndex
     * @param anotherIndex
     * @param aRow
     */
    public void printARowBetween(int anIndex, int anotherIndex, int aRow) {
        if (aRow >= myArray.length || anotherIndex >= myArray[aRow].length || anotherIndex < anIndex) {
            System.out.println("Invalid parameter");
            return;
        }

        //array[Row][Column]
        String output = Stream.iterate(anIndex, i -> i + 1)
                .limit(anotherIndex - anIndex + 1)
                .map(index -> myArray[aRow][index])
                .map(value -> value.toString())
                .reduce("", (out, value) -> out.concat(" ").concat(value));

        System.out.println(output.trim());
    }
}
