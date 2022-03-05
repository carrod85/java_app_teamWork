package ee.taltech.calculator.controller;

import ee.taltech.calculator.dto.Calculate3Result;
import ee.taltech.calculator.service.Calculate3Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("calculator")
@AllArgsConstructor
public class Calculate3 {
    private final Calculate3Service calculate3Service;

    @GetMapping("calculate3")
    public Calculate3Result calculate3(@RequestParam List<Integer> numbers) {
        return calculate3Service.calculate3(numbers);
    }

}