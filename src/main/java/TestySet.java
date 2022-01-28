import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;

public class TestySet {

    public HashSet<Integer> mySet;

    public TestySet() {
        mySet = new HashSet<Integer>();
    }

    public TestySet(HashSet<Integer> setty) {
        mySet = new HashSet<Integer>(setty);
    }

    // Write your findSumOfValuesMoreThan(Integer) method here
    public void findSumOfValuesMoreThan(Integer lowerLimit){
        int sum = mySet.stream()
                .parallel()
                .filter(entry -> entry.compareTo(lowerLimit) > 0)
                .mapToInt(x -> x)
                .sum();

        if (sum > 0) {
            System.out.println(sum);
        }
        else {
            System.out.println("none found");
        }
    }
}

