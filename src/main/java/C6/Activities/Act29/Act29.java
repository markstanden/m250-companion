package C6.Activities.Act29;

import java.util.*;

public class Act29 {
    public ArrayList<Integer> myList;

    public Act29() {
        myList = new ArrayList<>();
    }

    /**
     * Returns an int that gives the number of distinct values in myList.
     */
    public int numDistinctValues() {
        return new HashSet<>(myList).size();
    }
}

