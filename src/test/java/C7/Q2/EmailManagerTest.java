package C7.Q2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class EmailManagerTest {
    ByteArrayOutputStream console;

    int[][] emails = new int[52][7];


    @BeforeEach
    void setUp() {
        /* Redirect the stdout to our printstream
         * to monitor console output. */
        console = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(console);
        System.setOut(ps);
    }

    @Test
    /**
     * emailsOnDay(2,0)
     * "The number of emails received on Day 3 of Week 1 is xxx"
     */
    void emailsOnDay3Week4() {
        int[][] emails = {{2,3,4,7,12,3,1},{1,2,4,8,3,4,1},{1,3,2,5,6,7,2},{3,4,6,1,2,0,1}};
        EmailManager em = new EmailManager(emails);
        em.emailsOnDay(2,3);
        assertEquals("The number of emails received on Day 3 of Week 4 is 6\n", console.toString());
    }

    @Test
    void emailsOnFirstDay() {
        emails[0][0] = 10;
        EmailManager em = new EmailManager(emails);
        em.emailsOnDay(0,0);
        assertEquals("The number of emails received on Day 1 of Week 1 is 10\n", console.toString());
    }

    @Test
    void emailsOnLastDayFirstWeek() {
        emails[0][6] = 8;
        EmailManager em = new EmailManager(emails);
        em.emailsOnDay(6,0);
        assertEquals("The number of emails received on Day 7 of Week 1 is 8\n", console.toString());
    }

    @Test
    void emailsOnLastDayLastWeek() {
        emails[51][6] = 1000;
        EmailManager em = new EmailManager(emails);
        em.emailsOnDay(6,51);
        assertEquals("The number of emails received on Day 7 of Week 52 is 1000\n", console.toString());
    }

    @Test
    void emailsOnDay1Week1() {
        int[][] emails = {{2,3,4,7,12,3,1},{1,2,4,8,3,4,1},{1,3,2,5,6,7,2},{3,4,6,1,2,0,1}};
        EmailManager em = new EmailManager(emails);
        em.emailsOnDay(0,0);
        assertEquals("The number of emails received on Day 1 of Week 1 is 2\n", console.toString());
    }

    @Test
    void emailsOnDay7Week4() {
        int[][] emails = {{2,3,4,7,12,3,1},{1,2,4,8,3,4,1},{1,3,2,5,6,7,2},{3,4,6,1,2,0,1}};
        EmailManager em = new EmailManager(emails);
        em.emailsOnDay(6,3);
        assertEquals("The number of emails received on Day 7 of Week 4 is 1\n", console.toString());
    }
}