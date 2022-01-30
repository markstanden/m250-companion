package C7.Quiz1.Converter;

import java.util.stream.Stream;

public class Converter
{
    private int[] powerOfTwo = {128, 64, 32, 16, 8, 4, 2, 1};
    private String binNum;

    public Converter(String aNum)
    {
        binNum = aNum;
    }

    public int convertToDecimal(){

        // Convert the string into a stream of chars
        // replace '1's with int 1s
        // output an int array
        int[] binaryInts  = binNum.chars()
                .sequential()
                .map(asciiCode -> asciiCode == 49 ? 1 : 0)
                .toArray();

        // create a stream of integers
        // multiply each digit by its power of two representation
        return Stream.iterate(0, i -> i + 1)
                .limit(binaryInts.length)
                .mapToInt(x -> x)
                .map(i -> binaryInts[i] * powerOfTwo[i])
                .sum();
    }

}