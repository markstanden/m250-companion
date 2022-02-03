package C5_Streams.Activities;

import java.util.List;

public class Solution {

    /**
     * Print out the first four gems that are not diamonds
     **/
    public void printNonDiamonds(List<Gem> gems) {
        // Write code below which will
        // (1) Create a stream from the list gems
        // (2) Use a filter operation to select only
        // the gems whose kind is not "diamond"
        // (3) Select the first 4 items in the stream
        // (4) Print each of these items
        gems.stream()
                .filter(gem -> !gem.getKind().equals("diamond"))
                .limit(4)
                .forEach(gem -> System.out.println(gem));
    }

    /**
     * Return the number of blue or green gems
     * in the received list of gems
     */
    public long getNumberOfBlueOrGreen(List<Gem> gems) {
        // Write code below which will
        // (1) Create a stream from the list gems
        // (2) Use a filter operation to select only the
        //     gems with colour "blue" or "green"
        // (3) Count the number of items in the stream
        // Remember to return the result!
        long result = gems.stream()
                .filter(gem -> gem.getColour().equals("blue") || gem.getColour().equals("green"))
                .count();

        return result;

    }

    /**
     * Returns the total weight of all Gems in the gems
     * list of a particular kind
     */
    public double getTotalWeightOfKind(List<Gem> gems, String kind) {
        // Write code below which will
        // (1) Create a stream from the list gems
        // (2) Filter to select only the gems of the given kind
        // (3) Map each item in the filtered list to its weight
        // (4) Use reduce to calculate the total of these weights
        // Don't forget a semi-colon on the end
        // Don't forget to return the result!
        Double result = gems.stream()
                .filter(gem -> gem.getKind().equals(kind))
                .map(gem -> gem.getWeight())
                .reduce(0.0, (total, weight) -> total + weight);

        return result;
    }

    public void printNonRubyWeights(List<Gem> gems) {
        // Write code below to
        // (1) Create a stream from the list gems
        // (2) Filter to select gems whose kind is NOT "ruby"
        // (3) Map each item in the filtered list to its weight
        // (4) Output each of these weights
        gems.stream()
                .filter(gem -> !gem.getKind().equals("ruby"))
                .map(gem -> gem.getWeight())
                .forEach(gem -> System.out.println(gem));
    }

    public void printRedGems(List<Gem> gems) {
        // Write code below to
        // (1) Create a stream from the list of Gems
        // (2) Use a filter operation to select only the Gems with colour
        // equal to "red"
        // (3) Print out each C5.Act7.Gem in the filtered list
        gems.stream()
                .filter(gem -> gem.getColour().equals("red"))
                .forEach(gem -> System.out.println(gem));
    }
}