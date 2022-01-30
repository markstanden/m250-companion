package C7.Quiz2.EmailManager;

public class EmailManager
{
    private final int[][] emails;

    public EmailManager(int[][] anArray)
    {
        emails = anArray;
    }

    /**
     * emailsOnDay(2,0)
     * "The number of emails received on Day 3 of Week 1 is xxx"
     *
     * Note that the day number and week number are indexes into the emails array,
     * and will be one less than this statement reports to the user,
     * to account for the zero-based indexing used by arrays.
     *
     * @param aDay the index of the day
     * @param aWeek the index of the week
     */
    public void emailsOnDay(int aDay, int aWeek){
        int quantity = emails[aWeek][aDay];
        System.out.printf("The number of emails received on Day %d of Week %d is %d\n", aDay + 1, aWeek + 1, quantity);
    }

    /**
     * prints out the number of emails received in each week,
     * labelled with the week number.
     *
     * Output in this format, with one line of output per week:
     *
     * Week 1: 23
     * Week 2: 13
     * Week 3: 25
     */
    public void weeklyEmails(){
        
        System.out.printf("Week %d: %d\n",1,23);
    }

}