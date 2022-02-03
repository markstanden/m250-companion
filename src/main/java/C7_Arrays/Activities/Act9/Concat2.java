package C7_Arrays.Activities.Act9;

public class Concat2 {
    String[] words = new String[5];

    /**
     * Basic validity check of the words index
     *
     * @param index the index to check for validity
     * @return true if the index is valid, false if out of bounds.
     */
    private boolean isValid(int index) {
        return index >= 0 && index < words.length;
    }

    /**
     * The method prints out the result of concatenating
     * the words at the given indexes of the words array.
     *
     * @param first index of the first string to concatenate
     * @param last  index of the second string to concatenate
     */
    public void concatenateThese(int first, int last) {
        if (isValid(first) && isValid(last)) {
            String start = words[first];
            String end = words[last];
            System.out.println(start.concat(end));
        } else {
            System.out.println("Invalid index");
        }
    }
}
