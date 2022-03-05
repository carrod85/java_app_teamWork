package ee.taltech.calculator.util;

import lombok.NoArgsConstructor;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class AverageOfNegativeUtil {
    public static Double averageOfNegative(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }


        return numbers.stream()
                .mapToDouble(d -> d)
                .filter(i -> i < 0)
                .average()
                .getAsDouble();
    }
}
