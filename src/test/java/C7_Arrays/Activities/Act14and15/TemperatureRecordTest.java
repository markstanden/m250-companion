package C7_Arrays.Activities.Act14and15;

import BaseTests.ConsoleTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureRecordTest extends ConsoleTest {
    TemperatureRecord record;


    @BeforeEach
    public void setUp() {
        super.setUp();
        record = new TemperatureRecord();
        record.temps = new int[]{15,17,16,20,19,17,21};
    }

    @Test
    void numGreaterThanEqualAll() {
        record.numGreaterThanEqual(15);
        assertEquals("7", getStrippedConsole());
    }
    @Test
    void numGreaterThanEqualNone() {
        record.numGreaterThanEqual(22);
        assertEquals("0", getStrippedConsole());
    }
    @Test
    void numGreaterThanEqualMiddleWithEquals() {
        record.numGreaterThanEqual(17);
        assertEquals("5", getStrippedConsole());
    }
    @Test
    void numGreaterThanEqualMiddleJustHigher() {
        record.numGreaterThanEqual(18);
        assertEquals("3", getStrippedConsole());
    }

    @Test
    void hottestDayStandard(){
        record.hottestDay();
        assertEquals("Saturday", getStrippedConsole());
    }

    @Test
    void hottestDayCheckSunday(){
        TemperatureRecord r = new TemperatureRecord();
        r.temps = new int[]{21,20,20,20,20,20,20};
        r.hottestDay();
        assertEquals("Sunday", getStrippedConsole());
    }

    @Test
    void hottestDayCheckMonday(){
        TemperatureRecord r = new TemperatureRecord();
        r.temps = new int[]{21,21,20,20,20,20,20};
        r.hottestDay();
        assertEquals("Monday", getStrippedConsole());
    }

    @Test
    void hottestDayCheckTuesdayDay(){
        TemperatureRecord r = new TemperatureRecord();
        r.temps = new int[]{21,21,21,20,20,20,20};
        r.hottestDay();
        assertEquals("Tuesday", getStrippedConsole());
    }
    @Test
    void hottestDayCheckWednesday(){
        TemperatureRecord r = new TemperatureRecord();
        r.temps = new int[]{21,21,21,21,20,20,20};
        r.hottestDay();
        assertEquals("Wednesday", getStrippedConsole());
    }

    @Test
    void hottestDayCheckThursday(){
        TemperatureRecord r = new TemperatureRecord();
        r.temps = new int[]{21,21,21,21,21,20,20};
        r.hottestDay();
        assertEquals("Thursday", getStrippedConsole());
    }

    @Test

    void hottestDayCheckFriday(){
        TemperatureRecord r = new TemperatureRecord();
        r.temps = new int[]{21,21,21,21,21,21,20};
        r.hottestDay();
        assertEquals("Friday", getStrippedConsole());
    }

    @Test
    void hottestDayCheckSaturday(){
        TemperatureRecord r = new TemperatureRecord();
        r.temps = new int[]{20,20,20,20,20,20,20};
        r.hottestDay();
        assertEquals("Saturday", getStrippedConsole());
    }
}