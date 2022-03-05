package ee.taltech.calculator.util;

import lombok.NoArgsConstructor;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class AverageOfEvenUtil {
    public static Double averageOfEven(List<Integer> numbers){
        if(numbers == null  || numbers.isEmpty()){
            return null;
        }

        return numbers.stream()
                .mapToDouble(d -> d)
                .filter(i -> i > 0)
                .average()
                .orElse(0.0);
    }
}
