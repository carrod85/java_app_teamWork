package ee.taltech.calculator.service;


import ee.taltech.calculator.dto.Calculate2Result;
import ee.taltech.calculator.util.AbsoluteCalculatorUtil;
import ee.taltech.calculator.util.AverageOfEvenUtil;
import ee.taltech.calculator.util.PositivesCalculatorUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Calculate2Service {

    public Calculate2Result calculate2(List<Integer> numbers) {
        Calculate2Result result = new Calculate2Result();
        result.setPositives(PositivesCalculatorUtil.positiveNumbers(numbers));
        result.setAbsolutes(AbsoluteCalculatorUtil.absoluteNumbers(numbers));
        result.setAverageOfEven(AverageOfEvenUtil.averageOfEven(numbers));

        return result;
    }
}
