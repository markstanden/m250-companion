package C7_Arrays.Activities.Act8;

public class Concat {
    String[] words = new String[5];

    /**
     * Basic validity check of the words index
     * @param index the index to check for validity
     * @return true if the index is valid, false if out of bounds.
     */
    private boolean isValid(int index){
        return index >= 0 && index < words.length;
    }

    /**
     * The method prints out the result of concatenating
     * the words at the given indexes of the words array.
     * @param first index of the first string to concatenate
     * @param last index of the second string to concatenate
     */
    public void concatenateThese(int first, int last){
        String start = isValid(first) ? words[first] : "";
        String end = isValid(last) ? words[last] : "";

        System.out.println(start.concat(end));

    }
}
