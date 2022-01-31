package C6.Activities.Act18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    Company co = new Company();

    @BeforeEach
    void setUp() {
        co.getEmployees().put("reception", new Employee("Willis", 1995));
        co.getEmployees().put("accounts", new Employee("Aria", 1996));
        co.getEmployees().put("director", new Employee("Bran", 2002));
        co.getEmployees().put("payroll", new Employee("John", 1992));
        co.getEmployees().put("complaints", new Employee("Hodor", 2011));
    }

    @Test
    void getOccupantName() {
        assertEquals("Willis", co.getOccupantName("reception"));
        assertEquals("Aria", co.getOccupantName("accounts"));
        assertEquals("Bran", co.getOccupantName("director"));
        assertEquals("John", co.getOccupantName("payroll"));
        assertEquals("Hodor", co.getOccupantName("complaints"));
    }

    @Test
    void noSuchOffice() {
        assertEquals("No such office", co.getOccupantName("kitchen"));
        assertEquals("No such office", co.getOccupantName("payrise"));
        assertEquals("No such office", co.getOccupantName("hr"));
    }

}