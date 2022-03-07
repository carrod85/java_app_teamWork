package ee.taltech.calculator.util;

import org.apache.commons.collections4.CollectionUtils;
import lombok.NoArgsConstructor;


import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static lombok.AccessLevel.PRIVATE;
@NoArgsConstructor(access = PRIVATE)
public class AbsoluteCalculatorUtil {
    public static List<Integer> absoluteNumbers(List <Integer> numbers) {
        if (CollectionUtils.isEmpty(numbers)) {
            return Collections.emptyList();
        }
        // obtaining a list of unique absolute numbers
        // change negative into positives
        // remove duplicates or not ?? the 2 versions are below
        // it is also sorted for convenience
        // return numbers.stream().map(x -> x < 0 ? Math.abs(x) : x).collect(Collectors.toList())

        return numbers.stream().map(x -> x < 0 ? Math.abs(x) : x).distinct().sorted().collect(Collectors.toList());
    }
}
