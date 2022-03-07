package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvenCalculatorUtilTest {

    @Test
    @DisplayName("Even result is null or empty")
    void evenResultNullOrEmpty(){
        assertNull(EvenCalculatorUtil.evenNumbers(null));
        assertNull(EvenCalculatorUtil.evenNumbers(List.of()));


    }

    @Test
    @DisplayName("Even result is correct")
    void evenResultTest(){
        assertEquals(List.of(6,12), EvenCalculatorUtil.evenNumbers(List.of(7, 6, 12, 73, 1, 3)));
        assertEquals(List.of(118, 224), EvenCalculatorUtil.evenNumbers(List.of(224,443,23953,118,118)));
    }
}
