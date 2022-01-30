package C7.Quiz1.TimesTable;

import java.util.stream.Stream;

public class TimesTable
{
    // field to hold multiples of some integer from 1 to 12
    private int[] myTimesTable;

    // constructor
    public TimesTable()
    {
        myTimesTable = new int[12];
    }

    // getter for myTimesTable
    public int[] getMyTimesTable()
    {
        return myTimesTable;
    }

    // Write your two methods below
    public void populateTimesTable(int multiple){
        myTimesTable = Stream.iterate(multiple, i -> i + multiple)
                .limit(12)
                .mapToInt(x -> x)
                .toArray();
    }

    public void printTimesTable(){
        Stream.iterate(1, i -> i + 1)
                .limit(myTimesTable.length)
                .mapToInt(x -> x)
                .forEach(i -> System.out.println(i + " x " + myTimesTable[0] + " = " + myTimesTable[i - 1]));
    }
}