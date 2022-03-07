package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositivesCalculatorUtilTest {

    @Test
    @DisplayName("Positives result null or empty")
    void positivesIsNullOrEmpty(){
        assertEquals(List.of(), PositivesCalculatorUtil.positiveNumbers(null));
        assertEquals(List.of(), PositivesCalculatorUtil.positiveNumbers(List.of()));
    }

    @Test
    @DisplayName("Positives result is correct")
    void positivesRealTest(){
        assertEquals(List.of(3, 4, 29, 325), PositivesCalculatorUtil.positiveNumbers(List.of(4, 3, -29, 29, -23, 4, 325)));
        assertEquals(List.of(0, 1, 4), PositivesCalculatorUtil.positiveNumbers(List.of(-5, 4, 1, -15, 0, 0 )));
    }
}
