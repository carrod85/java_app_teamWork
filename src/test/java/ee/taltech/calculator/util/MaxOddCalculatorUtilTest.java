package ee.taltech.calculator.util;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MaxOddCalculatorUtilTest {

    @Test
    @DisplayName("MaxOdd result is null or empty")
    void maxOddIsNullOrEmpty(){
        assertNull(MaxOddCalculatorUtil.maxOddNumber(null));
        assertNull(MaxOddCalculatorUtil.maxOddNumber(List.of()));
    }

    @Test
    @DisplayName("MaxOdd result is correct")
    void longestStringTest(){
        assertEquals(29, MaxOddCalculatorUtil.maxOddNumber(List.of(4, 3, 29, 29)));
        assertEquals(1, MaxOddCalculatorUtil.maxOddNumber(List.of(-5, 4, 1, -15 )));
    }
}
