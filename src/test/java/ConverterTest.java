import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void convertToDecimalFull() {
        Converter con = new Converter("11111111");
        assertEquals(255, con.convertToDecimal());
    }

    @Test
    void convertToDecimalZeros() {
        Converter con = new Converter("00000000");
        assertEquals(0, con.convertToDecimal());
    }

    @Test
    void convertToDecimalLeadingZero() {
        Converter con = new Converter("01010101");
        assertEquals(85, con.convertToDecimal());
    }

    @Test
    void convertToDecimalLeadingOne() {
        Converter con = new Converter("10101010");
        assertEquals(170, con.convertToDecimal());
    }

    @Test
    void convertToDecimalOne() {
        Converter con = new Converter("00000001");
        assertEquals(1, con.convertToDecimal());
    }

    @Test
    void convertToDecimal128() {
        Converter con = new Converter("10000000");
        assertEquals(128, con.convertToDecimal());
    }
}