package C7.Quiz2.EmailManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailManagerNumOver extends EmailManagerTest{

    @Test
    public void ouDataOver0(){
        EmailManager em = new EmailManager(ouEmails);
        em.numOver(0);
        assertEquals("27", getStrippedConsole());
    }

    @Test
    public void ouDataOver1(){
        EmailManager em = new EmailManager(ouEmails);
        em.numOver(1);
        assertEquals("21", getStrippedConsole());
    }

    @Test
    public void ouDataOver2(){
        EmailManager em = new EmailManager(ouEmails);
        em.numOver(2);
        assertEquals("16", getStrippedConsole());
    }

    @Test
    public void ouDataOver12(){
        EmailManager em = new EmailManager(ouEmails);
        em.numOver(12);
        assertEquals("0", getStrippedConsole());
    }

    @Test
    public void withZeros(){
        int[][] emptyish = new int[1][7];
        emptyish[0][0] = 0;
        EmailManager em = new EmailManager(emptyish);
        em.numOver(0);
        assertEquals("0", getStrippedConsole());
    }
}
