package C7.Quiz2.EmailManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailManagerEmailsPerDayTest extends EmailManagerTest {
    @Test
    /**
     * emailsOnDay(2,0)
     * "The number of emails received on Day 3 of Week 1 is xxx"
     */
    void emailsOnDay3Week4() {
        EmailManager em = new EmailManager(ouEmails);
        em.emailsOnDay(2,3);
        assertEquals("The number of emails received on Day 3 of Week 4 is 6", getStrippedConsole());
    }

    @Test
    void emailsOnFirstDay() {
        emails[0][0] = 10;
        EmailManager em = new EmailManager(emails);
        em.emailsOnDay(0,0);
        assertEquals("The number of emails received on Day 1 of Week 1 is 10", getStrippedConsole());
    }

    @Test
    void emailsOnLastDayFirstWeek() {
        emails[0][6] = 8;
        EmailManager em = new EmailManager(emails);
        em.emailsOnDay(6,0);
        assertEquals("The number of emails received on Day 7 of Week 1 is 8", getStrippedConsole());
    }

    @Test
    void emailsOnLastDayLastWeek() {
        emails[51][6] = 1000;
        EmailManager em = new EmailManager(emails);
        em.emailsOnDay(6,51);
        assertEquals("The number of emails received on Day 7 of Week 52 is 1000", getStrippedConsole());
    }

    @Test
    void emailsOnDay1Week1() {
        EmailManager em = new EmailManager(ouEmails);
        em.emailsOnDay(0,0);
        assertEquals("The number of emails received on Day 1 of Week 1 is 2", getStrippedConsole());
    }

    @Test
    void emailsOnDay7Week4() {
        EmailManager em = new EmailManager(ouEmails);
        em.emailsOnDay(6,3);
        assertEquals("The number of emails received on Day 7 of Week 4 is 1", getStrippedConsole());
    }
}