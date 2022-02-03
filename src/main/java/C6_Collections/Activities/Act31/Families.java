package C6_Collections.Activities.Act31;

import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Predicate;

public class Families {
    HashMap<Integer, HashSet<String>> children;

    //constructor
    public Families() {
        children = new HashMap<>();
    }

    /**
     * return the number of houses that contain more than three children.
     */
    public long moreThanThree() {
        return moreThan(3);
        /*return children.values().stream()
                .filter(occupants -> occupants.size() >= 3)
                .count();*/
    }

    public long moreThan(int minAge) {
        return children.values().stream()
                .filter(minChildren(minAge))
                .count();
    }

    private Predicate<HashSet<String>> minChildren(int minimum) {
        return occupants -> occupants.size() >= minimum;
    }

    /**
     * return the total number of children who live in the street.
     */
    public int totalNumChildren() {
        /*
        classic java

        int result = 0;
        for(HashSet<String> household : children.values()) {
            result = result + household.size();
        }
        return result;
        */

        return children.values().stream()
                .mapToInt(HashSet::size)
                .sum();
    }


    /**
     * print the number of houses that contain more than three children.
     */
    public void moreThan3Children() {
        long moreThanThree = children.values().stream()
                .filter(minChildren(3))
                .count();

        String result = moreThanThree > 0 ? String.valueOf(moreThanThree) : "No";
        System.out.println(result + " houses have three or more children");
    }



}