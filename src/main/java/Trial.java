import java.util.Random;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Trial {

    private Patient[] before;
    private Patient[] after;

    public Trial(int patientNumber) {
        before = new Patient[patientNumber];
        after = new Patient[patientNumber];
        populateTestData(patientNumber);
    }

    /**
     * Starts the application
     */
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Creating " + number + " patient trial...");
        Trial T = new Trial(number);

        System.out.println("Populating Data...");
        T.populateTestData(number);

        System.out.println("\nDisplaying Results:");
        T.results();

        char g = 'M';
        System.out.println("\nDisplaying Results for " + g + " only:");
        T.resultsByGender(g);

        System.out.println("\nDisplaying Average Results:");
        T.summaryResults();

        System.out.println("\nDisplaying Headline:");
        T.printHeadlineResult();
    }

    /**
     * Returns the number of patients whose cholesterol level was dangerously high
     * before the trial but whose cholesterol level after the trial was good.
     * (A cholesterol level of 200 or less is considered to be good,
     * whereas a cholesterol level above 240 is considered to be dangerously high.)
     */
    public long numGoodResults() {
        return Stream.iterate(0, i -> i + 1)
                .limit(before.length)
                .filter(index -> before[index].getCLevel() > 240)
                .filter(index -> after[index].getCLevel() <= 200)
                .count();
    }

    /**
     * Prints the headline result to the console
     */
    public void printHeadlineResult() {
        System.out.printf("\nIn this trial %d patient%s out of a total of %d patient%s got a good result.\n",
                numGoodResults(),
                numGoodResults() > 1 ? "s" : "",
                before.length,
                before.length > 1 ? "s" : "");
    }

    /**
     * Prints results to the console
     */
    public void results() {
        printResultHeader();
        for (int i = 0; i < before.length; i++) {
            printIndividualResult(i);
        }
    }

    private void printIndividualResult(int patientIndex) {
        System.out.println("patient" + (patientIndex + 1) + "\t" +
                before[patientIndex].getCLevel() + "\t\t" +
                after[patientIndex].getCLevel());
    }

    public void summaryResults() {
        System.out.println(Math.round(getAverage(after) - getAverage(before)));
    }

    private Double getAverage(Patient[] arr) {
        return Arrays.stream(arr)
                .mapToInt(Patient::getCLevel)
                .average()
                .orElse(Double.NaN);
    }

    public void resultsByGender(char gender) {
        printResultHeader();
        for (int i = 0; i < before.length; i++) {
            if (before[i].getGender() == gender) {
                printIndividualResult(i);
            }
        }
    }

    private void printResultHeader() {
        System.out.println("Patient\t\tbefore\tafter");
    }

    /**
     * Populates the arrays before and after with random test data.
     * DO NOT ALTER THIS METHOD
     *
     * @param sampleSize an int representing the number of patients in the trial
     */
    private void populateTestData(int sampleSize) {
        Random ran = new Random();
        int genderInt;              // used to allocate gender randomly
        char genderChar;            // used to represent gender as a character
        int cLevel;                 // cholesterol level before and after trial
        final int minLevel = 100;   // minimum cholesterol level
        final int cBound = 301;     // upper bound for random level
        final double percX = 0.01;  // non-binary gender percentage of population

        for (int i = 0; i < before.length; i++) {
            genderInt = ran.nextInt(sampleSize);

            if (genderInt <= (sampleSize * percX)) {
                genderChar = 'X';
            } else if (genderInt < ((sampleSize - 1) / 2 - sampleSize * percX)) {
                genderChar = 'M';
            } else {
                genderChar = 'F';
            }

            //random cholesterol levels simulated
            cLevel = ran.nextInt(cBound) + minLevel;
            before[i] = new Patient(genderChar, cLevel);
            cLevel = ran.nextInt(cBound) + minLevel;
            after[i] = new Patient(genderChar, cLevel);
        }
    }
}

