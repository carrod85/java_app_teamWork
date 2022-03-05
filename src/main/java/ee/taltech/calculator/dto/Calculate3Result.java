package ee.taltech.calculator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Calculate3Result {

    private List<Integer> even;
    private List<Integer> absolutes;
    private Double averageOfNegatives;

}
