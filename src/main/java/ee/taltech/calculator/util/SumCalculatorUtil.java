package ee.taltech.calculator.util;


import lombok.NoArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;
@NoArgsConstructor(access = PRIVATE)
public class SumCalculatorUtil {
    public static Integer suma(List<Integer> numbers) {
        if (CollectionUtils.isEmpty(numbers)) {
            return null;
        }
        return numbers.stream()
                .reduce(0, Integer::sum);
    }
}
