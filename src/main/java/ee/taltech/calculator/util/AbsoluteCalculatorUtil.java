package ee.taltech.calculator.util;

import org.apache.commons.collections4.CollectionUtils;


import lombok.NoArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import static lombok.AccessLevel.PRIVATE;
@NoArgsConstructor(access = PRIVATE)
public class AbsoluteCalculatorUtil {
    public static List<Integer> absoluteNumbers(List <Integer> numbers) {
        if (CollectionUtils.isEmpty(numbers)) {
            return null;
        }
        // obtaining a list of unique absolute numbers
        // change negative into positives
        // remove duplicates or not ?? the 2 versions are below
        // it is also sorted for convenience

        // return numbers.stream().map(x -> x < 0 ? Math.abs(x) : x).collect(Collectors.toList());
        return numbers.stream().map(x -> x < 0 ? Math.abs(x) : x).distinct().sorted().collect(Collectors.toList());
    }
}
