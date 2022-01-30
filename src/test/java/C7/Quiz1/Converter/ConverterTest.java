package C7.Quiz1.Converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void convertToDecimalFull() {
        Converter con = new Converter("11111111");
        Assertions.assertEquals(255, con.convertToDecimal());
    }

    @Test
    void convertToDecimalZeros() {
        Converter con = new Converter("00000000");
        Assertions.assertEquals(0, con.convertToDecimal());
    }

    @Test
    void convertToDecimalLeadingZero() {
        Converter con = new Converter("01010101");
        Assertions.assertEquals(85, con.convertToDecimal());
    }

    @Test
    void convertToDecimalLeadingOne() {
        Converter con = new Converter("10101010");
        Assertions.assertEquals(170, con.convertToDecimal());
    }

    @Test
    void convertToDecimalOne() {
        Converter con = new Converter("00000001");
        Assertions.assertEquals(1, con.convertToDecimal());
    }

    @Test
    void convertToDecimal128() {
        Converter con = new Converter("10000000");
        Assertions.assertEquals(128, con.convertToDecimal());
    }
}