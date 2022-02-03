package C6_Collections.Activities.Act22;

import C6_Collections.Activities.Act18and23.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    C6_Collections.Activities.Act22.Company co = new Company();

    @BeforeEach
    void setUp() {
        co.getEmployees().add(new Employee("Willis", 1995));
        co.getEmployees().add(new Employee("Aria", 1996));
        co.getEmployees().add(new Employee("Bran", 2002));
        co.getEmployees().add(new Employee("John", 1992));
        co.getEmployees().add(new Employee("Hodor", 2011));
    }

    @Test
    void getYearValid(){
        assertEquals(1995, co.yearEmployeeStarted("Willis"));
        assertEquals(1996, co.yearEmployeeStarted("Aria"));
        assertEquals(2002, co.yearEmployeeStarted("Bran"));
        assertEquals(1992, co.yearEmployeeStarted("John"));
        assertEquals(2011, co.yearEmployeeStarted("Hodor"));
    }

    @Test
    void getYearInvalid(){
        assertEquals(0, co.yearEmployeeStarted("William"));
    }
}