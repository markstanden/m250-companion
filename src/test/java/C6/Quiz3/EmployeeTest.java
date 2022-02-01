package C6.Quiz3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void ThreeEmployeeID() {
        Employee em1 = new Employee();
        Employee em2 = new Employee();
        Employee em3 = new Employee();

        assertEquals(3, em3.getEmployeeID());
    }

}
