package ee.taltech.calculator.controller;

import ee.taltech.calculator.dto.Calculate1Result;
import ee.taltech.calculator.service.Calculate1Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("calculator")
@AllArgsConstructor
public class Calculate1 {
    private final Calculate1Service calculate1Service;

    @GetMapping("calculate1")
//    http://localhost:8080/calculator/calculate1?numbers=
    public Calculate1Result calculate1(@RequestParam List<Integer> numbers) {
        return calculate1Service.calculate1(numbers);
    }

}
