package C7_Arrays.Quiz2.EmailManager;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmailManager {
    private final int[][] emails;

    public EmailManager(int[][] anArray) {
        emails = anArray;
    }

    /**
     * emailsOnDay(2,0)
     * "The number of emails received on Day 3 of Week 1 is xxx"
     * <p>
     * Note that the day number and week number are indexes into the emails array,
     * and will be one less than this statement reports to the user,
     * to account for the zero-based indexing used by arrays.
     *
     * @param aDay  the index of the day
     * @param aWeek the index of the week
     */
    public void emailsOnDay(int aDay, int aWeek) {
        int quantity = emails[aWeek][aDay];
        System.out.printf("The number of emails received on Day %d of Week %d is %d\n", aDay + 1, aWeek + 1, quantity);
    }

    /**
     * prints out the number of emails received in each week,
     * labelled with the week number.
     * <p>
     * Output in this format, with one line of output per week:
     * <p>
     * Week 1: 23
     * Week 2: 13
     * Week 3: 25
     */
    public void weeklyEmails() {
        Stream.iterate(0, i -> i + 1)
                .limit(emails.length)
                .map(weekIndex -> "Week " + (weekIndex + 1) + ": " + getWeeklySum(weekIndex))
                .forEach(System.out::println);
    }

    private int getWeeklySum(int weekIndex) {
        return Arrays.stream(emails[weekIndex]).sum();

    }

    public void numOver(int threshold) {
        long result = Arrays.stream(emails)
                .mapToLong(weeklyEmails -> weeklyNumOver(threshold, weeklyEmails))
                .sum();
        System.out.println(result);
    }

    private long weeklyNumOver(int threshold, int[] weeklyEmails) {
        return Arrays.stream(weeklyEmails)
                .filter(dailyEmails -> dailyEmails > threshold)
                .count();
    }

}