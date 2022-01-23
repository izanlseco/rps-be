package com.task.rpsbe;

import com.task.rpsbe.model.Hand;
import com.task.rpsbe.service.PickService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PickTests {
    private PickService pickService;

    @BeforeEach
    public void setup() {
        pickService = new PickService();
    }

    @Test
    public void shouldReturnRock() {
        Hand result = pickService.pickAHand();

        assertThat(result.name()).isEqualTo("ROCK");
    }

    @Test
    public void shouldReturnPaper() {
        Hand result = pickService.pickAHand();

        assertThat(result.name()).isEqualTo("PAPER");
    }

    @Test
    public void shouldReturnScissors() {
        Hand result = pickService.pickAHand();

        assertThat(result.name()).isEqualTo("SCISSORS");
    }
}
