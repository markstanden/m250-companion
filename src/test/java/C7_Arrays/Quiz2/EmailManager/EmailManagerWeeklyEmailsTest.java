package C7_Arrays.Quiz2.EmailManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailManagerWeeklyEmailsTest extends EmailManagerTest{

    @Test
    public void ouData(){
        EmailManager em = new EmailManager(ouEmails);
        em.weeklyEmails();
        assertEquals("Week 1: 32\nWeek 2: 23\nWeek 3: 26\nWeek 4: 17", getStrippedConsole());
    }

    @Test
    public void withZeros(){
        int[][] emptyish = new int[1][7];
        emptyish[0][0] = 0;
        EmailManager em = new EmailManager(emptyish);
        em.weeklyEmails();
        assertEquals("Week 1: 0", getStrippedConsole());
    }
}
