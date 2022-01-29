import BaseTests.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest extends ConsoleTest {

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