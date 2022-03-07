package ee.taltech.calculator.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfNegativeUtilTest
{

    @Test
    @DisplayName("Average result is empty or null")
    void ResultNullOrEmpty()
    {
        assertNull(AverageOfNegativeUtil.averageOfNegative(null));
        assertNull(AverageOfNegativeUtil.averageOfNegative(List.of()));
    }

    @Test
    @DisplayName("Average of negatives is correct")
    void resultIsCorrect()
    {
        assertEquals(-4, AverageOfNegativeUtil.averageOfNegative(List.of(-2,-6)));
        assertEquals(-10, AverageOfNegativeUtil.averageOfNegative(List.of(2,4,6,8,-12,-14,-8,-6)));
    }
}

