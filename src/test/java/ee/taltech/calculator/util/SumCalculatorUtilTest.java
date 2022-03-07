package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorUtilTest {
    @Test
    @DisplayName("sum of null or empty list is null")
    void SumOfIntegerIsNullOrEmpty(){
        assertNull(SumCalculatorUtil.suma(null));
        assertNull(SumCalculatorUtil.suma(List.of()));
    }

    @Test
    @DisplayName("sum of integers is correct")
    void longestStringTest(){
        assertEquals(7, SumCalculatorUtil.suma(List.of(4, 3)));
        assertEquals(0, SumCalculatorUtil.suma(List.of(-5, 4, 1)));
    }
}
