package ee.taltech.calculator.util;

import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class AverageOfNegativeUtil {
    public static Double averageOfNegative(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }


        double avg = numbers.stream()
                .mapToDouble(d -> d)
                .filter(i -> i < 0)
                .average()
                .orElse(0);

        return (double) Math. round(avg * 100) / 100;
    }
}
