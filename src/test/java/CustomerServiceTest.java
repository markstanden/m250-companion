import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    ByteArrayOutputStream console;

    @BeforeEach
    public void setUp() {
        /* Redirect the stdout to our printstream
         * to monitor console output. */
        console = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(console);
        System.setOut(ps);
    }

    @Test
    void printNamesInvoicesPennyMoreThanHighest() {
        CustomerService cs = new CustomerService(3);
        cs.printNamesInvoicesMoreThan(34.28);
        assertEquals("No invoices over 34.28\n", console.toString());
    }

    @Test
    void printNamesInvoicesEqualToHighest() {
        CustomerService cs = new CustomerService(3);
        cs.printNamesInvoicesMoreThan(34.27);
        assertEquals("No invoices over 34.27\n", console.toString());
    }

    @Test
    void printNamesInvoicesLowerThanHighest() {
        CustomerService cs = new CustomerService(3);
        cs.printNamesInvoicesMoreThan(34.26);
        assertEquals("Anton\n", console.toString());
    }

    @Test
    void printNamesInvoicesEqualToSecondHighest() {
        CustomerService cs = new CustomerService(3);
        cs.printNamesInvoicesMoreThan(21.50);
        assertEquals("Anton\n", console.toString());
    }

    @Test
    void printNamesInvoicesLowerThanSecondHighest() {
        CustomerService cs = new CustomerService(3);
        cs.printNamesInvoicesMoreThan(21.49);
        assertEquals("Lindsey\nAnton\n", console.toString());
    }

    @Test
    void printNamesInvoicesLowerThanLowest() {
        CustomerService cs = new CustomerService(3);
        cs.printNamesInvoicesMoreThan(12.31);
        assertEquals("Lindsey\nAnton\nMustafa\n", console.toString());
    }

}