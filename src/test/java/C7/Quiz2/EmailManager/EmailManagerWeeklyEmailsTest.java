package C7.Quiz2.EmailManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailManagerWeeklyEmailsTest extends EmailManagerTest{

    @Test
    public void ouData(){
        EmailManager em = new EmailManager(ouEmails);
        em.weeklyEmails();
        assertEquals("Week 1: 32\nWeek 2: 23\nWeek 3: 28\nWeek 4: 17", getStrippedConsole());
    }

    @Test
    public void withZeros(){
        int[][] empty = new int[1][7];
        EmailManager em = new EmailManager(empty);
        em.weeklyEmails();
        assertEquals("Week 1: 0", getStrippedConsole());
    }
}
