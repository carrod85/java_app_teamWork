package ee.taltech.calculator.util;

import lombok.NoArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class PositivesCalculatorUtil {
    public static List<Integer> positiveNumbers(List<Integer> numbers){
        if (CollectionUtils.isEmpty(numbers)) {
            return Collections.emptyList();
        }
        return numbers.stream().filter(i -> i > 0).distinct().sorted().collect(Collectors.toList());
    }
}
