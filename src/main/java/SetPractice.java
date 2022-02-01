import java.util.HashSet;

public class SetPractice {

    public HashSet<Integer> mySet;

    public SetPractice() {
        mySet = new HashSet<Integer>();
    }

    public SetPractice(HashSet<Integer> setty) {
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

