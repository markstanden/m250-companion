package C6_Collections.Activities.Act28;

import java.util.Comparator;
import java.util.HashSet;

public class Act28
{
    public HashSet<Double> mySet;

    public Act28()
    {
        mySet = new HashSet<>();
    }

    /**
     * returns the highest value in mySet.
     * You can assume that mySet contains at least one value
     * and that all values in the set are greater than 0.0.
     */
    public Double returnHighest(){
        /*ArrayList<Double> sortedArray;
        sortedArray = new ArrayList<>(mySet);
        sortedArray.sort(Comparator.reverseOrder());
        return sortedArray.get(0);*/

        return mySet.stream()
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .orElseThrow();
    }
}