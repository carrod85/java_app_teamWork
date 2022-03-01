package ee.taltech.calculator.controller;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class Calculate1ControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("wrong path returns 404 status bad request or default object when correct")
    void stringsTest() throws Exception {
        mvc.perform(get("/calculator/calculate1"))
                .andExpect(status().is4xxClientError());

        mvc.perform(get("/calculator/calculate1?numbers="))
                .andExpect(status().is2xxSuccessful())
//                {"longest":null,"shortest":null,"concat":null}
                .andExpect(content().string("{}"));
    }

    @Test
    @DisplayName("list of values request, returns object with the wanted methods")
    void stringsCalculationTest() throws Exception {
        mvc.perform(get("/calculator/calculate1?numbers=1,-4,-8,8,9,0"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.maxOdd").value(9))
                .andExpect(jsonPath("$.sum").value(6))
                .andExpect(jsonPath("$.absolute").value(Lists.newArrayList(0,1,4,8,9)));//value(List.of(0,1,4,8,9)));//value((0,1,4,8,9)));
    }
}