package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AbsoluteCalculatorUtilTest {

    @Test
    @DisplayName("Absolut result is null or empty")
    void absolutIsNullOrEmpty(){
        assertNull(AbsoluteCalculatorUtil.absoluteNumbers(null));
        assertNull(AbsoluteCalculatorUtil.absoluteNumbers(List.of()));
    }

    @Test
    @DisplayName("Absolut result is correct")
    void longestStringTest(){
        assertEquals(List.of(3, 4, 29), AbsoluteCalculatorUtil.absoluteNumbers(List.of(-4, 3, -29, 29, -29)));
        assertEquals(List.of(0, 1, 4, 5, 15), AbsoluteCalculatorUtil.absoluteNumbers(List.of(-5, 4, 1, -15, 0, 0 )));
    }
}
