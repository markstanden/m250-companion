package C6.Activities.Act31;

import java.util.HashMap;
import java.util.HashSet;

public class Families {
    HashMap<Integer, HashSet<String>> children;

    //constructor
    public Families() {
        children = new HashMap<Integer, HashSet<String>>();
    }

    /**
     * return the number of houses that contain more than three children.
     */
    public long moreThanThree() {
        return children.values().stream()
                .filter(occupants -> occupants.size() >= 3)
                .count();
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
                .mapToInt(set -> set.size())
                .reduce(0, (totalChildren, childrenAtAddress) -> totalChildren + childrenAtAddress);
    }


    /**
     * print the number of houses that contain more than three children.
     */
    public void moreThan3Children() {
        long moreThanThree = children.values().stream()
                .filter(occupants -> occupants.size() >= 3)
                .count();

        String result = moreThanThree > 0 ? String.valueOf(moreThanThree) : "No";
        System.out.println(result + " houses have three or more children");
    }

}