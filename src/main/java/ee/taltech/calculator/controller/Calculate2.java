package ee.taltech.calculator.controller;

import ee.taltech.calculator.dto.Calculate2Result;
import ee.taltech.calculator.service.Calculate2Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("calculator")
@AllArgsConstructor
public class Calculate2 {
        private final Calculate2Service calculate2Service;

    @GetMapping("calculate2")
    public Calculate2Result calculate2(@RequestParam List<Integer> numbers) {
        return calculate2Service.calculate2(numbers);
    }

}
