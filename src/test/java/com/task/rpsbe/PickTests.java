package com.task.rpsbe;

import com.task.rpsbe.model.Hand;
import com.task.rpsbe.service.PickService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@SpringBootTest
public class PickTests {
    private PickService pickService;

    @BeforeEach
    public void setup() {
        pickService = mock(PickService.class);
    }

    @Test
    public void shouldReturnRock() {
        when(pickService.pickAHand()).thenReturn(Hand.ROCK);

        Hand result = pickService.pickAHand();

        verify(pickService, times(1)).pickAHand();

        assertThat(result.name()).isEqualTo("ROCK");
    }

    @Test
    public void shouldReturnPaper() {
        when(pickService.pickAHand()).thenReturn(Hand.PAPER);

        Hand result = pickService.pickAHand();

        verify(pickService, times(1)).pickAHand();

        assertThat(result.name()).isEqualTo("PAPER");
    }

    @Test
    public void shouldReturnScissors() {
        when(pickService.pickAHand()).thenReturn(Hand.SCISSORS);

        Hand result = pickService.pickAHand();

        verify(pickService, times(1)).pickAHand();

        assertThat(result.name()).isEqualTo("SCISSORS");
    }
}
