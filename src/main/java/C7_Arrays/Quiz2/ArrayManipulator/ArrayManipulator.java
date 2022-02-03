package C7_Arrays.Quiz2.ArrayManipulator;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayManipulator {
    private int[][] myArray;

    public ArrayManipulator(int[][] anArray) {
        myArray = anArray;
    }

    /**
     * The method prints out the elements in the row of myArray given by aRow,
     * from index anIndex to index anotherIndex (inclusive).
     * The values should be printed on a single line, with a space after each.
     * <p>
     * If any of the parameters are invalid, the method should print out "Invalid parameter".
     *
     * @param anIndex       The index of the first item to display
     * @param anotherIndex  The index of the last item to display
     * @param aRow          The row to take the data from
     */
    public void printARowBetween(int anIndex, int anotherIndex, int aRow) {
        if (aRow >= myArray.length
                || anotherIndex >= myArray[aRow].length
                || anotherIndex < anIndex) {
            System.out.println("Invalid parameter");
            return;
        }

        //array[Row][Column]
        String output = IntStream.rangeClosed(anIndex, anotherIndex)
                .map(index -> myArray[aRow][index])
                .mapToObj(value -> String.valueOf(value))
                .reduce("", (out, value) -> out.concat(" ").concat(value));

        System.out.println(output.trim());
    }

    /**
     * The method should print out all even elements in column aCol of myArray,
     * each followed by a space.
     *
     * If aCol is not a valid index the message "Invalid column" is printed instead.
     */
    public void printEvensInColumn(int aCol){
        if(aCol >= myArray[0].length || aCol < 0){
            System.out.println("Invalid column");
            return;
        }
        String output = Arrays.stream(myArray)
                .map(row -> row[aCol])
                .filter(value -> value % 2 == 0)
                .map(value -> value.toString())
                .reduce("", (result, value) -> result.concat(" ").concat(value));

        System.out.println(output.trim());
    }
}
